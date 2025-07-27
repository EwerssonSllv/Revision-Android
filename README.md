# Android RecyclerView App

This is a basic Android project written in **Kotlin**, aimed at demonstrating how to use `RecyclerView` and its main components. Ideal for beginners learning native Android development.

---

## Technologies and Concepts Used

### 1. RecyclerView
A powerful component that displays **lists or grids** of items efficiently.  
It reuses old views instead of creating new ones every time you scroll, improving performance.  
Supports different layouts for each item if needed, and works with vertical/horizontal scrolling.

### 2. TextView
A UI component used to **display text** on the screen, such as names, titles, or descriptions.

### 3. ImageView
A UI component used to **display images**, such as icons or profile pictures.  
It can load images from the `drawable` folder or from the internet (using libraries like Glide or Picasso).

---

## Layout Types

### LinearLayout
Arranges elements **in a single row or column** (horizontal or vertical).  
Useful for simple stacked layouts.

---

### RelativeLayout
Allows positioning elements **in relation to other elements**.  
For example: place a button to the right of an image.

---

## Layout Size Properties

### match_parent
The view will **expand to fill all available space** from its parent.

### wrap_content
The view will **shrink to fit only its content**.

---

## List Architecture

### Item (Model)
Represents the data of a list item.  
Example:

```kotlin
data class Item(val name: String, val email: String, val image: Int)
```

## Adapter
The class that binds your data to the RecyclerView.
Responsible for:

- Creating the ViewHolder

- Returning item count

- Binding data to the UI components

---

### ViewHolder
Stores references to the item’s views (TextView, ImageView, etc.)
Avoids repeated findViewById calls and improves performance.

- LayoutManager
Defines how items are arranged inside the RecyclerView:

- LinearLayoutManager: vertical or horizontal list

- GridLayoutManager: grid-style list

- StaggeredGridLayoutManager: grid with variable-sized items

## Core Concepts

### Context
An object that gives access to app-level resources and functions.
Used to open activities, access layouts, strings, images, and more.

---

### Inflate (or LayoutInflater)
The process of turning an XML layout (item_view.xml) into a usable View object in code.
Used like: LayoutInflater.from(context).inflate(...)

---

### Activity
A screen in your Android app.
Each Activity is a user interface that can host fragments, layouts, or business logic.

---

### Callback
A function that is called when something happens, like a button click or network response.
Useful for handling asynchronous or event-driven actions.

