# 🚗 DriveMind — Smart Driver Companion

**DriveMind** is a high-fidelity, dark-themed Android application built with **Jetpack Compose**. Designed specifically for rideshare and delivery drivers, it provides a modern dashboard to track daily earnings, manage automated background utilities, and optimize working hours.

---

## ✨ Features & Visual Highlights

- **Modern Dark Theme**: Custom dark palette tailored for high visibility and reduced eye strain during night drives.
- **Dynamic Date Header**: Automatically formats and displays the current localized date (`dd de MMMM de yyyy`).
- **Earnings & Performance Breakdown**: Visual summary of daily revenue, trip counts, working hours, and platform distribution (Uber, 99, etc.).
- **Quick Settings Utilities**: Instant toggles for driver support tools (Copilot analysis, automatic screenshots, and background camera).
- **Stateful Action Button**: Interactive start/stop work shift toggle with smooth visual state transitions.
- **Custom Bottom Navigation**: Bespoke `ImageVector` implementation designed with proper system gesture inset handling (`navigationBarsPadding`).

---

## 🛠️ Tech Stack & Architecture

- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose) (100% Kotlin)
- **Design System**: Material Design 3 + Custom DriveMind Typography ("Sora") & Components
- **Architecture**: Single Activity with Modular Screen Components
- **Language**: Kotlin

---

## 🚀 Roadmap

- [x] High-fidelity UI implementation (Figma compliance)
- [x] Dynamic localized date integration
- [x] Custom bottom navigation bar & system bar inset handling
- [ ] Implement `HomeViewModel` for dynamic state & real-time earnings calculation
- [ ] Multi-screen navigation (Rides History, Settings, Profile)
- [ ] Foreground Service integration for driver automation tools

---
