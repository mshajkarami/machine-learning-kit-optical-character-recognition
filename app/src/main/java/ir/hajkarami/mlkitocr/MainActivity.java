package ir.hajkarami.mlkitocr;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.TextRecognizerOptions;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textTv;
    Button speechBtn, imageBtn;

    InputImage inputImage;
    TextRecognizer recognizer;
    TextToSpeech textToSpeech;
    public Bitmap textImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        imageView = findViewById(R.id.imageView);
        textTv = findViewById(R.id.textTv);
        speechBtn = findViewById(R.id.read_text);
        imageBtn = findViewById(R.id.choice_image);

        imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenGallery();
                textImage = imageView.getDrawingCache();
                inputImage = InputImage.fromBitmap(textImage, 0);
            }
        });
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status  != TextToSpeech.ERROR)
                    textToSpeech.setLanguage(Locale.US);
            }
        });
        speechBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.speak(textTv.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }

    private void OpenGallery() {

    }
}