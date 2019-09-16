/*
 * MIT Open license
 */
package core;

/**
 * @author MSilva
 */
public class Dados {

    private String name;
    private int age;
    private String born_year;
    private String naturality;
    private String civil_state;

    /**
     * 
     */
    public Person() {
        this("", 0, "", "", "");
    }

    public Person(String name, int age, String nascimento, String naturalidade, String estado) {
        this.name = name;
        this.age = age;
        this.born_year = nascimento;
        this.naturality = naturalidade;
        this.civil_state = estado;
    }

    /**
     * Setters to get the age for the person class
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setters to get the name for the person clas
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the name for the person class 
     * @param naturalidade
     */
    public void setNaturality(String naturalidade) {
        this.naturality = naturalidade;
    }

    /**
     * get the civil state for the person clas 
     * @param estado_civil
     */
    public void setCivil_state(String estado_civil) {
        this.civil_state = estado_civil;
    }

    /**
     * gets the born year
     * @param data_nascimento
     */
    public void setBorn_year(String data_nascimento) {
        this.born_year = data_nascimento;
    }

    /**
     * gets the name of the person
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * gets the age of the user
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     * 
     * @return
     */
    public String getBorn_year() {
        return born_year;
    }

    /**
     *
     * @return
     */
    public String getNaturality() {
        return naturality;
    }

    /**
     *
     * @return
     */
    public String getCivil_state() {
        return civil_state;
    }

    public String toString() {
        return "hello " + this.name + ", you are " + this.age + " years old,"
                + " born in the date of " + this.born_year + ", in "
                + this.naturality + " and are " + this.civil_state;
    }

}
