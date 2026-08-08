# Experiment 7: Adaptive Android Application with ListView and ImageView

**Name:** Tejas Sunil Waske  
**USN:** 25MCAR0189

## Aim
To create an adaptive Android application using ListView and ImageView with a custom Adapter.

## Concept / Technology
`ListView` is a UI component used to display a scrollable list of items. To customize each item's appearance (beyond plain text), a **custom Adapter** class extending `ArrayAdapter` is created, which overrides `getView()` to inflate a custom row layout containing an `ImageView` and `TextView`. This is more flexible than the default `ArrayAdapter` and is a foundation for the more advanced `RecyclerView`.

## Scenario
The app displays a list of fruit names, each paired with an icon, using a custom adapter (`MyAdapter`). Clicking on any list item shows a Toast displaying the name of the selected fruit.

## Project Structure

AdaptiveListViewMAD7/
├── app/
│ ├── src/main/
│ │ ├── java/com/example/adaptivelistviewmad7/
│ │ │ ├── MainActivity.kt # Sets up ListView and adapter
│ │ │ └── MyAdapter.kt # Custom ArrayAdapter for list items
│ │ ├── res/layout/
│ │ │ ├── activity_main.xml # Contains the ListView
│ │ │ └── list_item.xml # Row layout with ImageView + TextView
│ │ └── AndroidManifest.xml
│ └── build.gradle.kts
└── README.md

## Output
<img width="1080" height="2358" alt="screenshot7 png" src="https://github.com/user-attachments/assets/1ec8adcd-9f08-4be6-81d7-eb169f1cc410" />


## Test Cases

### Test Case 1: List Displayed with Icons
**Steps:** Launch the app.  
**Expected Result:** A list of fruit names, each with an icon, is displayed on screen.  


### Test Case 2: Item Click Interaction
**Steps:** Tap on any item in the list (e.g., "Mango").  
**Expected Result:** A Toast message "You selected: Mango" appears.  


### Test Case 3: Verification with Name and USN
**Steps:** An additional list item labeled "Tejas Sunil Waske - 25MCAR0189" added and displayed to confirm authorship.  
**Expected Result:** Name and USN visible as part of the running app screen.  

## Conclusion
This experiment demonstrates building a custom adapter for ListView to display complex row layouts combining ImageView and TextView, along with handling click events on list items.
