# Pack configuration and balance

## Compatibility baseline

This pack targets Minecraft 1.21.1 with NeoForge 21.1.x. Download each mod's 1.21.1 NeoForge release and its listed dependencies from its official project page. This repository does not bundle third-party mod jars or assert that every named project currently publishes a compatible build. Check the release file's game version and loader before adding it. Keep a copy of the working `mods` and `config` directories for every tested pack update.

Choose one primary recipe browser initially: JEI is the baseline. EMI is optional and should be added only after verifying the specific 1.21.1 NeoForge build and integrations; running both can create duplicate recipe UI. Likewise, optional enchantment overhauls and companions are not required for the core progression.

## Progression and balance goals

The machine-readable stage map is `progression.json`. Use it as the structure for FTB Quests chapters: first home and food, spell discovery, awakening and ranged combat, Twilight exploration, major boss routes, Deeper and Darker, then repeatable mastery. Keep quests informational and reward useful materials rather than handing out dimension-tier equipment early.

Preserve each dimension's intended entry and boss sequence. Avoid global loot multipliers that let one dimension skip another. Provide meaningful melee, spell, and ranged options at each stage; TACZ ammunition should remain a resource and not make boss mechanics irrelevant. Keep rare relics as build-defining finds, not guaranteed starter rewards.

For the requested effectively limitless enchantment path, use an optional enchantment overhaul only if its exact 1.21.1 NeoForge release is available. Start with conservative costs and caps, test anvil XP and item durability at high levels, and keep ordinary enchantments viable. Do not assume an uncapped level system is balanced or available by default.

## Exploration and seasons

Use Serene Seasons only with a matching NeoForge build and check crop/food integration with Let's Do content. Seasonal changes should add planning rather than block all food access: retain dependable non-seasonal food and let quests teach seasonal preparation. Xaero's maps are navigation aids, not substitutes for landmarks and exploration rewards.

## Server and testing

For multiplayer, install the same gameplay mod versions on clients and server, and follow individual projects' client-only/server requirements. Back up worlds before changing world-generation or dimension mods. Test a fresh world through each progression stage, inspect server logs after adding mods, and test boss combat with melee, spells, and TACZ separately. Apply `server.properties` values from the adjacent file as a starting point, adjusting view and simulation distances for server hardware.
