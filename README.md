# CoreAPI

**Version:** 1.0  
**Minecraft:** 1.21.8  
**Programmiersprache:** Java

---

## 📝 Beschreibung

**CoreAPI** ist das Interface-Plugin für das Core-System. Es stellt **nur Schnittstellen, DTOs und Events** bereit, die andere Plugins nutzen können, um auf Spieler- und Servicedaten zuzugreifen, ohne die Implementierung preiszugeben.

**Ziele:**
- Saubere Trennung zwischen API und Implementierung
- Einfaches Nutzen von Services durch andere Plugins
- Kein Zugriff auf interne Logik (MongoDB, Redis etc.)

---

## 📦 Inhalt

### Pakete

---

## ⚡ Installation

1. Füge die `CoreAPI.jar` zu deinem Plugin-Buildpath hinzu oder lege sie im `plugins/`-Ordner ab.
2. Andere Plugins können direkt die Interfaces importieren und die Services über den Bukkit `ServicesManager` nutzen.
3. Das **Core-Plugin** muss auf dem Server installiert sein, um die Services tatsächlich bereitzustellen.

---