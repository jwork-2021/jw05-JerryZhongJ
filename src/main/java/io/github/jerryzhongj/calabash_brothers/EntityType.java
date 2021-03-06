package io.github.jerryzhongj.calabash_brothers;

import lombok.Getter;

public enum EntityType {
    FAKE(0x00, "Fake Entity"),
    CALABASH_BRO_I(0x01, "Calabash Brother I"),
    CALABASH_BRO_II(0x02, "Calabash Brother II"),
    CALABASH_BRO_III(0x03, "Calabash Brother III"),
    CALABASH_BRO_VI(0x06, "Calabash Brother VI"),
    CALABASH_BRO_VII(0x07, "Calabash Brother VII"),
    Earth(0x10, "Earth");

    @Getter
    private final int code;
    @Getter
    private final String name;
    private EntityType(int code, String name){
        this.code = code;
        this.name = name;
    }

    public static EntityType getType(int code){
        for(EntityType type : EntityType.values())
            if(type.code == code)
                return type;
        return null;
    }

    public static EntityType getType(String name){
        for(EntityType type : EntityType.values())
            if(type.name.equals(name))
                return type;
        return null;
    }

}
