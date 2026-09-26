# Experiment 7 — Adaptive UI using ListView and ImageView

An Android application built in **Kotlin** that demonstrates an **adaptive user interface** using `ListView` and `ImageView`. The app presents a **Fruit Catalog**: a scrollable list of fruits where each row shows an icon, name, short description, and price. Tapping any fruit opens a dialog with a larger image and its name.

---

## Student Details

| Field | Details |
|-------|---------|
| **Name** | Tejas Sunil Waske |
| **USN** | 25MCAR0189 |
| **Experiment** | 7 — Create an Adaptive UI using ListView and ImageView |

---

## Concept / Technology Behind the Experiment

An **adaptive UI** is one that arranges and displays content dynamically based on the data provided to it, instead of hard-coding each item on screen. This experiment uses the following Android components:

- **ListView** — a view group that displays a vertically scrollable list of items. It recycles row views for smooth scrolling and can handle any number of items.
- **ImageView** — displays an image (here, a vector drawable of each fruit) inside every row and inside the details dialog.
- **ArrayAdapter (custom adapter)** — the bridge between the data and the `ListView`. A custom adapter, `MyAdapter`, extends `ArrayAdapter` and inflates a custom row layout (`list_item.xml`) for each fruit, binding the icon, name, description, and price.
- **Data class (`Fruit`)** — a Kotlin model that holds each fruit's name, description, price, and image resource, keeping the data clean and structured.
- **AlertDialog** — shows a pop-up with the selected fruit's large image and name when a row is clicked, demonstrating item-level interaction.

Because the list is generated from a data list and rendered through an adapter, adding or removing a fruit only requires changing the data — the UI adapts automatically. This is the core idea of an adaptive UI.

---

## Scenario Used to Demonstrate It

The chosen scenario is a **Fruit Catalog** for a grocery/store app. Each list item represents a fruit with:

- A **colored icon** (custom vector drawable)
- The **fruit name** (e.g., *Apple*)
- A **short description** (e.g., *Crisp and sweet*)
- The **price** (e.g., *₹120/kg*)

When the user taps a fruit, an `AlertDialog` displays a **larger image** of that fruit along with its **name** and a **CLOSE** button. This clearly shows how a single row layout adapts to different data and how `ImageView` is used both in the list and in the dialog.

---

## Features

- Clean **green Material-style theme** with a header bar and a footer showing student details.
- **Card-style rows** with rounded corners, an icon, name, description, and price.
- **Custom vector drawable icons** for each fruit (no external image files needed).
- **Click interaction** — tapping a fruit opens a details dialog with a large image.
- Fully **data-driven** list using a custom `ArrayAdapter`.

---

## Project Folder & File Structure

```
AdaptiveListViewMAD7/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/adaptivelistviewmad7/
│           │   ├── MainActivity.kt        # Entry point: builds the fruit list,
│           │   │                          # sets the adapter, handles row clicks,
│           │   │                          # and contains the Fruit data class.
│           │   └── MyAdapter.kt           # Custom ArrayAdapter that binds each
│           │                              # Fruit object to a list_item row.
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   ├── activity_main.xml  # Main screen: header + ListView + footer.
│           │   │   ├── list_item.xml      # Layout for a single fruit row (card).
│           │   │   └── dialog_fruit.xml   # Layout for the fruit-details dialog.
│           │   │
│           │   ├── drawable/
│           │   │   ├── card_bg.xml        # Rounded white background for rows.
│           │   │   ├── fruit_apple.xml    # Vector icon — Apple
│           │   │   ├── fruit_banana.xml   # Vector icon — Banana
│           │   │   ├── fruit_grapes.xml   # Vector icon — Grapes
│           │   │   ├── fruit_mango.xml    # Vector icon — Mango
│           │   │   ├── fruit_orange.xml   # Vector icon — Orange
│           │   │   └── fruit_watermelon.xml # Vector icon — Watermelon
│           │   │
│           │   └── values/
│           │       ├── colors.xml         # App colour palette (green theme).
│           │       ├── strings.xml        # String resources.
│           │       └── themes.xml         # App theme.
│           │
│           └── AndroidManifest.xml        # App configuration & launcher activity.
│
├── screenshots/                           # Output & test-case screenshots.
│   ├── output.png
│   ├── testcase1.png
│   ├── testcase2.png
│   └── testcase3.png
│
├── build.gradle.kts (:app)                # App-level Gradle build script.
└── README.md                              # This file.
```

---

## How to Run

1. Clone the repository:
```bash
   git clone https://github.com/<your-username>/AdaptiveListViewMAD7.git
```
2. Open the project in **Android Studio**.
3. Let **Gradle** sync and build.
4. Connect a device or start an emulator, then click **Run ▶**.

---

## Output Screenshot

The main screen — a scrollable Fruit Catalog with a green header and a footer showing student details.



---

## Test Cases

### Test Case 1 — App launches and displays the fruit list (shows Name & USN)

| | |
|---|---|
| **Description** | On launching the app, the Fruit Catalog loads with all six fruits, each showing icon, name, description, and price. The footer displays **Tejas Sunil Waske / USN: 25MCAR0189 / Experiment 7**. |
| **Input** | Launch the app. |
| **Expected Output** | List of fruits is displayed correctly with the student name and USN visible in the footer. |
| **Result** | ✅ Pass |

<img width="732" height="1600" alt="711" src="https://github.com/user-attachments/assets/2b86bca5-2e94-4edc-9476-af43f2578e26" />



### Test Case 2 — Tapping a fruit opens its details dialog

| | |
|---|---|
| **Description** | Tapping a fruit row (e.g., *Apple*) opens an `AlertDialog` showing a larger image of the fruit and its name. |
| **Input** | Tap on the **Apple** row. |
| **Expected Output** | A dialog appears with the Apple image, the name "Apple", and a **CLOSE** button. |
| **Result** | ✅ Pass |



### Test Case 3 — Closing the dialog returns to the list

| | |
|---|---|
| **Description** | Pressing **CLOSE** on the details dialog dismisses it and returns the user to the fruit list without any change in state. |
| **Input** | Tap **CLOSE** on the open dialog. |
| **Expected Output** | The dialog closes and the full fruit list is shown again. |
| **Result** | ✅ Pass |

<img width="732" height="1600" alt="722" src="https://github.com/user-attachments/assets/fbedba95-d396-49a2-8ab4-bb98fa4efa43" />


---

## Conclusion

This experiment demonstrates how to build an **adaptive UI** in Android using `ListView`, `ImageView`, and a **custom `ArrayAdapter`**. Because the list is generated from a data model, the interface adapts automatically to the underlying data, and an `AlertDialog` adds simple, effective item-level interaction.
