package com.example.pokedexv3;

public class PokemonDetails {

    private String name;
    private String id;
    private String type;
    private String height;
    private String weight;
    private String catchrate;
    private String ev;
    private String abilityname;
    private String abilitydescription;
    private String secondabilityname;
    private String secondabilitydescription;
    private String hiddenabilityname;
    private String hiddenabilitydescription;
    private String weakness;
    private String resistance;
    private String immunity;
    private String statpv;
    private String statatt;
    private String statdef;
    private String statattspe;
    private String statdefspe;
    private String statvit;
    private String totalstat;
    private String image;
    private String artwork;
    private String sprite;
    private String shinysprite;

    public PokemonDetails(String name, String id, String type, String height, String weight, String catchrate, String ev,
                          String abilityname, String abilitydescription, String secondabilityname, String secondabilitydescription, String hiddenabilityname, String hiddenabilitydescription,
                          String weakness, String resistance, String immunity,
                          String statpv, String statatt, String statdef, String statattspe, String statdefspe, String statvit, String totalstat,
                          String image, String artwork, String sprite, String shinysprite) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.catchrate = catchrate;
        this.ev = ev;
        this.abilityname = abilityname;
        this.abilitydescription = abilitydescription;
        this.secondabilityname = secondabilityname;
        this.secondabilitydescription = secondabilitydescription;
        this.hiddenabilityname = hiddenabilityname;
        this.hiddenabilitydescription = hiddenabilitydescription;
        this.weakness = weakness;
        this.resistance = resistance;
        this.immunity = immunity;
        this.statpv = statpv;
        this.statatt = statatt;
        this.statdef = statdef;
        this.statattspe = statattspe;
        this.statdefspe = statdefspe;
        this.statvit = statvit;
        this.totalstat = totalstat;
        this.image = image;
        this.artwork = artwork;
        this.sprite = sprite;
        this.shinysprite = shinysprite;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getCatchrate() {
        return catchrate;
    }

    public String getEv() {
        return ev;
    }

    public String getAbilityname() {
        return abilityname;
    }

    public String getAbilitydescription() {
        return abilitydescription;
    }

    public String getSecondabilityname() {
        return secondabilityname;
    }

    public String getSecondabilitydescription() {
        return secondabilitydescription;
    }

    public String getHiddenabilityname() {
        return hiddenabilityname;
    }

    public String getHiddenabilitydescription() {
        return hiddenabilitydescription;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getResistance() {
        return resistance;
    }

    public String getImmunity() {
        return immunity;
    }

    public String getStatpv() {
        return statpv;
    }

    public String getStatatt() {
        return statatt;
    }

    public String getStatdef() {
        return statdef;
    }

    public String getStatattspe() {
        return statattspe;
    }

    public String getStatdefspe() {
        return statdefspe;
    }

    public String getStatvit() {
        return statvit;
    }

    public String getTotalstat() {
        return totalstat;
    }

    public String getImage() {
        return image;
    }

    public String getArtwork() {
        return artwork;
    }

    public String getSprite() {
        return sprite;
    }

    public String getShinysprite() {
        return shinysprite;
    }
}
