﻿# machine-learning-kit-optical-character-recognition
 
This Android application utilizes Google’s **ML Kit** for text recognition and **Text-to-Speech** (TTS) to read aloud the text recognized from an image. The app allows the user to pick an image from the gallery, processes the image using ML Kit’s OCR features, and displays the recognized text on the screen. Additionally, the app uses TTS to read the recognized text aloud.

## Features
- **Image Selection**: Allows users to choose an image from the gallery.
- **OCR (Optical Character Recognition)**: Uses ML Kit to recognize text from the selected image.
- **Text-to-Speech**: Reads aloud the recognized text using the device’s TTS engine.
- **Edge-to-Edge UI**: Adapts to different screen sizes with the help of the Edge-to-Edge layout.
- **Smooth UI**: The app uses **Glide** to load and display images in the `ImageView` and shows recognized text in a `TextView`.

## Prerequisites
Before running this project, make sure you have the following:
- **Android Studio** installed on your system.
- **Google Play Services** available on your Android device (for ML Kit).
- An active internet connection to download the necessary dependencies.

## Installation

1. Clone or download this repository.
2. Open the project in **Android Studio**.
3. Make sure the necessary dependencies are included in the `build.gradle` files.
4. Connect an Android device or use an emulator.
5. Run the app.

## Usage
1. **Pick an Image**: Tap the "Select Image" button to open your gallery and pick an image containing text.
2. **Text Recognition**: The app processes the image and displays the recognized text in the app's main screen.
3. **Text-to-Speech**: Tap the "Read Text" button to hear the recognized text spoken aloud.

## Libraries Used
- **ML Kit**: Google’s ML Kit for text recognition.
- **Glide**: Image loading and caching.
- **Text-to-Speech (TTS)**: Android's built-in TTS functionality for reading text aloud.

## License
This project is open-source and available under the MIT License.

## Acknowledgements
- **Google ML Kit** for OCR functionality.
- **Android Text-to-Speech** for speech synthesis.
