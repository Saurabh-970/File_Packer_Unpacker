# 📦 Packer Unpacker Application (Java GUI)

## 🚀 Overview

The **Packer Unpacker Application** is a Java-based desktop application built using **Swing (AWT)** that allows users to:

* 📦 **Pack multiple files** from a folder into a single file
* 📂 **Unpack files** from the packed file back to original form
* 🔐 Apply simple **XOR-based encryption/decryption** for basic security

This project demonstrates **file handling, GUI design, and basic encryption techniques** in Java.

---

## 🛠️ Tech Stack

* **Language:** Java
* **UI Framework:** Swing (AWT)
* **Concepts Used:**

  * File Handling (`FileInputStream`, `FileOutputStream`)
  * Byte Manipulation
  * Basic Encryption (XOR)
  * Event-Driven Programming
  * GUI Design using Swing

---

## 📂 Project Architecture

```id="l2x9pk"
PackerUnpackerGUI
│
├── GUI Layer (Swing Components)
│     ├── Buttons (Pack / Unpack / Execute)
│     ├── TextFields (Folder / File Input)
│     └── Labels
│
├── Packing Logic
│     ├── Read files from folder
│     ├── Create header (filename + size)
│     ├── Encrypt using XOR
│     └── Write into single packed file
│
└── Unpacking Logic
      ├── Read header
      ├── Extract file metadata
      ├── Decrypt using XOR
      └── Restore original files
```

---

## 🧠 Working Principle

### 🔹 Packing Process

1. User selects **Pack mode**
2. Inputs:

   * Folder name
   * Output packed file name
3. Application:

   * Reads all files from folder
   * Creates a **fixed-size header (100 bytes)**
   * Encrypts file data using XOR (`0x11`)
   * Writes all data into a single packed file

---

### 🔹 Unpacking Process

1. User selects **Unpack mode**
2. Inputs:

   * Packed file name
3. Application:

   * Reads header information
   * Extracts file name and size
   * Decrypts using XOR
   * Recreates original files

---

## ⚙️ Features

### ✅ Pack Files

* Combines multiple files into one
* Adds metadata header
* Applies encryption

### ✅ Unpack Files

* Extracts files from packed file
* Restores original structure

### ✅ Simple Encryption

* Uses XOR operation (`0x11`)
* Lightweight and fast

### ✅ GUI Interface

* Easy-to-use buttons
* Dynamic input fields
* Interactive feedback (dialogs)

---

## 📸 Workflow

```id="m7z1hk"
Start Application
      ↓
Select Mode (Pack / Unpack)
      ↓
Enter Required Inputs
      ↓
Click Execute
      ↓
Perform Operation
      ↓
Show Success Message
```

---

## ▶️ How to Run

### 1. Compile

```bash id="d1z9q2"
javac PackerUnpackerGUI.java
```

### 2. Run

```bash id="p3k8wq"
java PackerUnpackerGUI
```

---

## 📁 Example

### Packing:

```id="9xg2lm"
Folder: MyFiles
Output: data.pack
```

### Unpacking:

```id="v8n4ra"
Input: data.pack
Output: Extracted files in same directory
```

---

## 🔐 Encryption Note

* Uses simple XOR encryption with key `0x11`
* Not suitable for high-security applications
* Demonstrates basic encryption concept

---

## 💡 Future Enhancements

* 🔒 Strong encryption (AES)
* 📁 Folder structure preservation
* 📊 Progress bar in GUI
* 📂 File chooser dialog (browse instead of typing)
* 🖥️ Modern UI (JavaFX)

---

## 🧑‍💻 Author

**Saurabh Bhonsle**
📍 Pune, India

---
  

## 📌 License

This project is open-source and free to use.
