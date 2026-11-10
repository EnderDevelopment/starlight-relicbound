# Minecraft Modpack Blueprint and NeoForge Companion Mod

Starlight Relicbound is a Minecraft modpack blueprint and NeoForge companion mod for Minecraft 1.21.1. It combines magic, ability progression, ranged combat, artifacts, companions, seasonal survival, dimensions, navigation, multiplayer quests, and boss encounters into a staged exploration experience.

## Install

1. Install Minecraft 1.21.1 with a compatible NeoForge 21.1.x client.
2. Install Java 21.
3. Open [`pack/mod-list.json`](pack/mod-list.json) and download the listed 1.21.1 NeoForge releases from their official project pages.
4. Download every dependency required by each selected mod. Some projects divide features into separate libraries or content modules.
5. Place the downloaded mod files in the instance's `mods` folder.
6. Keep client-only mods out of dedicated servers when required by their authors.
7. Launch the instance once and review the logs for missing dependencies or compatibility errors.
8. Start a new world after installing world-generation or dimension mods. Back up existing worlds before changing an established mod list.

Use JEI as the initial recipe viewer. Add EMI only after confirming that the specific 1.21.1 NeoForge releases and integrations work correctly together. TACZ content packs are separate downloads and must match the installed TACZ version.

For multiplayer, install matching gameplay mod versions on the server and every client. Configure FTB Quests from [`pack/progression.json`](pack/progression.json), and use [`pack/server.properties`](pack/server.properties) as a starting point for cooperative server settings.

## Use

Follow the progression stages in [`pack/progression.json`](pack/progression.json):

1. Establish a home, food supply, storage, and seasonal preparation.
2. Discover early spells and gather materials through exploration.
3. Develop Tensura abilities and TACZ ranged combat.
4. Explore The Twilight Forest and prepare for dimension encounters.
5. Challenge L_Ender's Cataclysm and Eternal Starlight bosses.
6. Enter Deeper and Darker for late-game objectives and rare rewards.
7. Continue with repeatable exploration, team quests, collection goals, and optional enchantment depth.

The project does not redistribute third-party mod files or automatically download them. Confirm the game version, NeoForge loader, dependencies, and compatibility of every selected release before adding it to the pack.

The repository also contains a small NeoForge companion mod that identifies the pack in-game. Build it from the project directory with:

```sh
./gradlew build
```

The compiled companion mod is written to `build/libs`. Install that jar like any other NeoForge mod if you want the pack identifier available in the game.

Review [`pack/CONFIGURATION.md`](pack/CONFIGURATION.md) for compatibility guidance, progression balance, seasonal setup, multiplayer notes, and testing recommendations.

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/0995e36f-199c-4dfa-9732-5094cc2d3bc7?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=0995e36f-199c-4dfa-9732-5094cc2d3bc7
