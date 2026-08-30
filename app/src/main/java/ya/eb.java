package ya;
import m2.p0;
import mf.f;
import r2.x;

import android.view.inputmethod.ExtractedText;

/* loaded from: classes.dex */
public abstract class eb {
    public static final ExtractedText a(x xVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = xVar.f24515a.f20477v;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = xVar.f24516b;
        extractedText.selectionStart = p0.e(j10);
        extractedText.selectionEnd = p0.d(j10);
        extractedText.flags = !f.m(xVar.f24515a.f20477v, '\n') ? 1 : 0;
        return extractedText;
    }
}
