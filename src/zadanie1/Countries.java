package zadanie1;

public class Countries {
    private String code;
    private String name;
    private String population;

    public Countries(String code, String name, String population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Kraj: " + name +", Kod: " + code +", liczba ludności : " + population;
    }
}
