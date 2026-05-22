# Cooler Popsicle

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

A Minecraft mod that makes popsicles actually cool you down.

Eat a **Melon Popsicle** from [Farmer's Delight](https://modrinth.com/mod/farmers-delight) to gain the **Cool Effect**, which removes and blocks the **Heat Stroke** effect from [Ecliptic Seasons](https://modrinth.com/mod/ecliptic-seasons).

## Features

- **Cool Effect** — Grants immunity to Heat Stroke while active
- Configurable cooling duration
- Toggleable via config file

## Requirements

- Minecraft **1.21.1**
- NeoForge
- [KotlinForForge](https://modrinth.com/mod/kotlin-for-forge)
- [Farmer's Delight](https://modrinth.com/mod/farmers-delight) — provides the Melon Popsicle item
- [Ecliptic Seasons](https://modrinth.com/mod/ecliptic-seasons) — provides the Heat Stroke effect

## Configuration

Located in `config/cooler_popsicle.toml`:

| Setting | Default | Description |
|---------|---------|-------------|
| `isEnabled` | `true` | Whether the mod is enabled |
| `coolingTime` | `6000` | Duration of Cool Effect in ticks (6000 = 5 minutes) |

## License

This project is licensed under the [MIT License](LICENSE).
