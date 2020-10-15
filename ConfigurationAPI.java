package me.premiering;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ConfigurationAPI {
    public static final ConfigurationAPI getInstance = new ConfigurationAPI();

    public Configuration loadExistingConfiguration(File file) throws IOException {
        JSONObject jsonObject = new JSONObject(FileUtils.readFileToString(file, Charsets.UTF_8));
        return new Configuration(file, jsonObject.toMap());
    }

    public Configuration newConfiguration(File file) {
        return new Configuration(file);
    }
}
