# JSON-Config-Thingy
Simplified org.json (org.json wrapper I think they call it)
Requires org.json (you can download the jar and add it as a library https://repo1.maven.org/maven2/org/json/json/20200518/json-20200518.jar )
# Usage
New Configuration:
````java
        Configuration config = ConfigurationAPI.getInstance.newConfiguration(new File("testinqasd.json"));
        config.set("thing", "haha");
        config.set("nerds", 69420);
        try {
            config.save();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(config.get("thing"));
````
Existing Configuration:
````java
        Configuration config = null;
        try {
            config = ConfigurationAPI.getInstance.loadExistingConfiguration(new File("testinqasd.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (config != null) {
            System.out.println(config.get("thing"));
            System.out.println(config.get("nerds"));
        }
        config.set("hehewegotitworking", "this is a value");
````
Everything should be pretty self explanatory and simple.
