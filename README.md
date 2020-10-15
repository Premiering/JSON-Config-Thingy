# JSON-Config-Thingy
Simplified org.json (org.json wrapper I think they call it)
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
