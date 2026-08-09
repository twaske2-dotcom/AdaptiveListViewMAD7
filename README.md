# Experiment 7: Adaptive Android Application with ListView and ImageView

## Student Details

**Name:** Tejas Sunil Waske  
**USN:** 25MCAR0189  
**Experiment No.:** 7

---

## Aim

To create an adaptive Android application using ListView and ImageView with a custom Adapter.

---

## Objective

The objective of this experiment is to understand how ListView can be customized using a custom Adapter to display multiple types of information in each list item.

The application demonstrates displaying fruit names along with their corresponding icons and handling item click events.

---

## Concept / Technology Used

### ListView

`ListView` is an Android UI component used to display a vertically scrollable list of items.

In this experiment, ListView is used to display a list of fruits.

---

### Custom Adapter

A custom Adapter is used to control how each item in the ListView is displayed.

The application uses a custom Adapter named:

```text
MyAdapter
```

The Adapter extends `ArrayAdapter` and overrides `getView()` to create a customized row layout.

---

### ImageView

`ImageView` is used to display an image or icon for each fruit in the ListView.

---

### TextView

`TextView` is used to display the name of each fruit.

---

### Toast

A Toast message is displayed when the user clicks on a fruit item.

For example:

```text
You selected: Mango
```

---

## Scenario

The application displays a list of fruits.

Each fruit item contains:

- Fruit icon
- Fruit name

The application uses a custom Adapter to combine the `ImageView` and `TextView` inside each list item.

When the user clicks on a fruit, a Toast message displays the selected fruit name.

The application also contains the student's name and USN as a list item for verification.

### Application Flow

```text
                 Android Application
                         |
                         ↓
                    MainActivity
                         |
                         ↓
                      ListView
                         |
                         ↓
                   Custom Adapter
                    (MyAdapter)
                         |
             +-----------+-----------+
             |                       |
             ↓                       ↓
         ImageView                TextView
        Fruit Icon               Fruit Name
             |                       |
             +-----------+-----------+
                         |
                         ↓
                  User Clicks Item
                         |
                         ↓
                    Toast Message
                         |
                         ↓
                "You selected: Fruit"
```

---

## Software Requirements

- Android Studio
- Kotlin
- Android SDK
- Gradle
- Android Emulator or Physical Android Device

---

## Technologies Used

- Kotlin
- Android ListView
- Custom ArrayAdapter
- ImageView
- TextView
- Toast
- XML Layout
- Android SDK

---

## Project Folder and File Structure

```text
AdaptiveListViewMAD7/
│
├── app/
│   │
│   ├── src/
│   │   │
│   │   └── main/
│   │       │
│   │       ├── java/
│   │       │   └── com/example/adaptivelistviewmad7/
│   │       │       ├── MainActivity.kt
│   │       │       └── MyAdapter.kt
│   │       │
│   │       ├── res/
│   │       │   └── layout/
│   │       │       ├── activity_main.xml
│   │       │       └── list_item.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle.kts
│
├── gradle/
│   └── wrapper/
│
├── .idea/
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
├── screenshot.png
└── README.md
```

---

## Important Files and Their Purpose

### MainActivity.kt

`MainActivity.kt` is the main Activity of the application.

It:

- Creates the ListView.
- Provides the fruit data.
- Connects the ListView with the custom Adapter.
- Handles item click events.
- Displays the selected fruit using a Toast message.

---

### MyAdapter.kt

`MyAdapter.kt` is the custom Adapter class.

It extends `ArrayAdapter` and overrides `getView()` to create a customized ListView item.

The custom row contains:

- `ImageView`
- `TextView`

This allows every fruit to be displayed with its own icon and name.

---

### activity_main.xml

`activity_main.xml` defines the main screen of the application.

It contains the `ListView` used to display the list of fruits.

---

### list_item.xml

`list_item.xml` defines the design of an individual ListView item.

Each row contains:

```text
ImageView + TextView
```

The ImageView displays the fruit icon and the TextView displays the fruit name.

---

### AndroidManifest.xml

`AndroidManifest.xml` contains the application configuration and Activity declaration required by the Android system.

---

### build.gradle.kts

This file contains the Android application build configuration and required dependencies.

---

## Working / Implementation

### 1. Launch Application

The application starts from `MainActivity`.

The main screen contains a ListView displaying the available fruits.

---

### 2. Display Fruit List

The application provides a list of fruit names along with their corresponding icons.

Example:

```text
🍎 Apple
🍌 Banana
🥭 Mango
🍊 Orange
```

The actual icons are displayed using ImageView.

---

### 3. Custom Adapter

The `MyAdapter` class is used to customize the appearance of each ListView item.

The Adapter inflates:

```text
list_item.xml
```

and binds the fruit image and fruit name to the corresponding views.

---

### 4. Item Click Interaction

When the user clicks a fruit item, the application displays a Toast message.

For example, when Mango is selected:

```text
You selected: Mango
```

---

### 5. Student Verification

The application includes the student's name and USN as part of the displayed list for verification.

```text
Tejas Sunil Waske - 25MCAR0189
```

---

# Test Cases

## Test Case 1: List Displayed with Icons

### Test Objective

To verify that the ListView displays fruit names along with their corresponding icons.

### Test Steps

1. Launch the application.
2. Observe the main screen.
3. Check the displayed fruit list.
4. Verify that each item contains an icon and fruit name.

### Expected Result

A list of fruit names, each accompanied by an icon, should be displayed successfully.

### Actual Result

The fruit list with icons was displayed successfully.

### Status

**PASS ✅**

---

## Test Case 2: Item Click Interaction

### Test Objective

To verify that clicking a fruit item displays the selected fruit using a Toast message.

### Test Steps

1. Launch the application.
2. Select a fruit from the ListView.
3. Observe the Toast message.

### Expected Result

A Toast message should display the selected fruit.

Example:

```text
You selected: Mango
```

### Actual Result

The selected fruit name was displayed successfully using a Toast message.

### Status

**PASS ✅**

---

## Test Case 3: Verify Student Name and USN

### Test Objective

To verify that the student's name and USN are displayed correctly in the application.

### Test Data

**Name:** Tejas Sunil Waske  
**USN:** 25MCAR0189

### Test Steps

1. Launch the application.
2. Observe the ListView.
3. Locate the student information item.
4. Verify the displayed name and USN.

### Expected Result

The application should display:

```text
Tejas Sunil Waske - 25MCAR0189
```

### Actual Result

The student's name and USN were displayed successfully.

### Status

**PASS ✅**

---

# Output

The application successfully demonstrates an adaptive ListView using a custom ArrayAdapter.

Each list item contains an ImageView and TextView, and clicking an item displays a Toast message containing the selected fruit name.

### Output Screenshot

<img width="1080" height="2358" alt="screenshot7 png" src="https://github.com/user-attachments/assets/16eb7c07-65ff-424f-bf5a-82abfb06c898" />


---

# Steps to Run the Project

1. Open the project in Android Studio.
2. Allow Gradle synchronization to complete.
3. Connect an Android device or start an Android Emulator.
4. Select the application from the Run Configuration.
5. Click the **Run ▶** button.
6. Launch the application.
7. Observe the fruit list.
8. Click any fruit item.
9. Verify the Toast message.

---

# Requirements

## Hardware Requirements

- Laptop/Desktop
- Android Device or Android Emulator
- USB Cable if using a physical Android device

## Software Requirements

- Android Studio
- Kotlin
- Android SDK
- Gradle

---

# Learning Outcomes

After completing this experiment, the following concepts were understood:

- ListView
- Custom Adapter
- ArrayAdapter
- `getView()`
- ImageView
- TextView
- Toast
- Custom ListView row layout
- Handling ListView item clicks
- Displaying images with list data
- Android XML Layouts

---

# Result

The Android application was successfully developed and executed using a custom Adapter with ListView and ImageView.

The application successfully displays fruit names with icons and responds to item click events using Toast messages.

---

# Conclusion

The experiment successfully demonstrated how to create an adaptive Android application using ListView and a custom Adapter.

The custom `MyAdapter` class was used to display each fruit with an ImageView and TextView. The application also handled ListView item click events and displayed the selected fruit name using a Toast message.

Thus, the objective of creating an adaptive Android application using ListView, ImageView, and a custom Adapter was successfully achieved.

---

# Student Information

**Name:** Tejas Sunil Waske  
**USN:** 25MCAR0189

**Experiment:** Experiment 7 – Adaptive Android Application with ListView and ImageView

---

# GitHub Repository

**Repository Name:** AdaptiveListViewMAD7

**GitHub Link:**

https://github.com/twaske2-dotcom/AdaptiveListViewMAD7

---

# Reference

- Android Developers – ListView
- Android Developers – ArrayAdapter
- Android Developers – ImageView
- Android Developers – Toast

---

## Author

**Tejas Sunil Waske**

**USN:** 25MCAR0189
