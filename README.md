# Android RecyclerView App

This is a basic Android project written in **Kotlin**, aimed at demonstrating how to use `RecyclerView` and its main components.  
Ideal for beginners learning native Android development.

---

## Technologies and Concepts Used (with Code Examples)

---

### 1. RecyclerView

> A powerful component that displays **lists or grids** efficiently, reusing views to save memory.

#### Where It’s Used:
```kotlin
val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
recyclerView.layoutManager = LinearLayoutManager(this)
recyclerView.adapter = MyAdapter(applicationContext, items)
```

- **Why:** Displays a scrollable list of items.
- **How:** Requires a `LayoutManager` and an `Adapter` to function.

---

### 2. TextView

> Displays text on the screen.

#### Where It’s Used (in item_view.xml):
```xml
<TextView
    android:id="@+id/name"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Name" />
```

#### And bound in code:
```kotlin
holder.nameView.text = item.name
```

- **Why:** Shows the name of the person in each list item.

---

### 3. ImageView

> Displays images (from resources or internet).

#### Where It’s Used:
```xml
<ImageView
    android:id="@+id/imageview"
    android:layout_width="60dp"
    android:layout_height="60dp"
    android:src="@drawable/sample_image" />
```

#### In Kotlin:
```kotlin
holder.imageView.setImageResource(item.image)
```

- **Why:** Shows the image/avatar for each contact.

---

## Layout Types

### LinearLayout

> Arranges elements **horizontally or vertically**.

#### Where It’s Used:
```xml
<LinearLayout
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    
    <!-- ImageView and TextView inside -->
</LinearLayout>
```

- **Why:** Lays out image and text side by side.

---

### RelativeLayout *(Not used in this project)*

> Allows placing one view **relative to another** (ex: below or to the right of another view).

- **Why skip it?** This project uses `LinearLayout` and `ConstraintLayout` is preferred in modern apps.

---

## Layout Size Properties

### match_parent

> Makes the view fill all available space.

### wrap_content

> Makes the view just big enough to fit its content.

#### Example:
```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

- **Why:** Ensures text doesn’t use more space than necessary.

---

## List Architecture

### Item (Model)

> A Kotlin `data class` representing each item’s data.

#### item.kt:
```kotlin
data class Item(val name: String, val email: String, val image: Int)
```

- **Why:** Defines the structure of the data you want to display.

---

### Adapter

> Binds data to views in the `RecyclerView`.

#### MyAdapter.kt:
```kotlin
class MyAdapter(private val context: Context, private val items: List<Item>)
    : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
        holder.nameView.text = item.name
        holder.emailView.text = item.email
        holder.imageView.setImageResource(item.image)
    }

    override fun getItemCount(): Int = items.size
}
```

- **Why:** Provides views for each item and binds the model data to them.

---

### ViewHolder

> Holds references to the views inside each item, improving performance.

#### MyViewHolder.kt:
```kotlin
class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.imageview)
    val nameView: TextView = itemView.findViewById(R.id.name)
    val emailView: TextView = itemView.findViewById(R.id.email)
}
```

- **Why:** Prevents repeated calls to `findViewById` on scroll.

---

### LayoutManager

> Controls how list items are arranged (vertical, horizontal, grid…).

#### In MainActivity.kt:
```kotlin
recyclerView.layoutManager = LinearLayoutManager(this)
```

- **Why:** Tells RecyclerView to arrange items in a vertical list.

---

## Core Concepts

### Context

> Gives access to application resources (layouts, strings, etc.)

#### In Adapter:
```kotlin
LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
```

- **Why:** Needed to inflate views and access resources.

---

### Inflate (LayoutInflater)

> Converts XML layout into actual View objects.

#### In Adapter:
```kotlin
LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
```

- **Why:** Turns `item_view.xml` into a real View shown in the list.

---

### Activity

> A screen that displays UI and logic.

#### MainActivity.kt:
```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        ...
    }
}
```

- **Why:** Launches your app and sets up the RecyclerView with data.

---

### Callback

> A function called when an event happens (clicks, responses, etc.)

#### Not in this project yet, but common in:

```kotlin
holder.itemView.setOnClickListener {
    // Callback: do something when item is clicked
}
```

- **Why:** Useful to handle interactions from the user.

---

## Project Structure

```
├── MainActivity.kt         # Main screen (Activity)
├── MyAdapter.kt            # Adapter that binds data to RecyclerView
├── MyViewHolder.kt         # ViewHolder storing item views
├── Item.kt                 # Model (data class)
├── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   │   └── item_view.xml
│   └── drawable/
│       └── *.png (images)
```

---

## Requirements

- Android Studio Arctic Fox or newer
- Kotlin support
- Minimum SDK 21 (Android 5.0)
- Gradle & Build tools updated

---

## Questions?

Feel free to open an issue or contribute to this educational project.

---
