package com.github.gabrielsilper;

import com.github.gabrielsilper.models.City;
import com.github.gabrielsilper.models.Country;
import com.github.gabrielsilper.models.State;
import com.github.gabrielsilper.utils.SerializeUtils;

import java.io.IOException;

public class SerializeMain {
    public static void main(String[] args) throws IOException {
        State stateAM = new State("Amazonas", "AM");
        State statePA = new State("Pará", "PA");

        City city = new City("Manaus");

        city.setState(stateAM);

        Country country = new Country("Brasil", "América do Sul");

        country.addState(stateAM);
        country.addState(statePA);

        SerializeUtils.serialize(country.getStates(), "states.dat");
    }
}
