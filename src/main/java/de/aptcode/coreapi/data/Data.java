package de.aptcode.coreapi.data;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import javax.annotation.Nullable;
import java.lang.reflect.Type;

/*

    Data class is used for easily implementing data objects with fromJson and toJson

 */

public abstract class Data<DataType> {

    private Gson gson = new Gson();
    private final Type type;

    protected Data() {
        // Stores the actual generic type at runtime using TypeToken for proper JSON serialization/deserialization
        this.type = new TypeToken<DataType>(getClass()){}.getType();
    }

    @Nullable
    public DataType fromJson(String json) {
        return gson.fromJson(json, type);
    }

    @Nullable
    public String toJson(DataType dataType) {
        return gson.toJson(dataType);
    }

}
