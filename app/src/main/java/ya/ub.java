package ya;
import f2.c;
import s3.a;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public abstract class ub {
    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        int i10;
        CharSequence subSequence;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            c.i(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i11 >= 30) {
            c.i(editorInfo, charSequence);
            return;
        }
        int i12 = editorInfo.initialSelStart;
        int i13 = editorInfo.initialSelEnd;
        if (i12 > i13) {
            i = i13;
        } else {
            i = i12;
        }
        if (i12 <= i13) {
            i12 = i13;
        }
        int length = charSequence.length();
        if (i >= 0 && i12 <= length) {
            int i14 = editorInfo.inputType & 4095;
            if (i14 != 129 && i14 != 225 && i14 != 18) {
                if (length <= 2048) {
                    c(editorInfo, charSequence, i, i12);
                    return;
                }
                int i15 = i12 - i;
                if (i15 > 1024) {
                    i10 = 0;
                } else {
                    i10 = i15;
                }
                int i16 = 2048 - i10;
                int min = Math.min(charSequence.length() - i12, i16 - Math.min(i, (int) (i16 * 0.8d)));
                int min2 = Math.min(i, i16 - min);
                int i17 = i - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i17))) {
                    i17++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i12 + min) - 1))) {
                    min--;
                }
                int i18 = min2 + i10;
                int i19 = i18 + min;
                if (i10 != i15) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i17, i17 + min2), charSequence.subSequence(i12, min + i12));
                } else {
                    subSequence = charSequence.subSequence(i17, i19 + i17);
                }
                c(editorInfo, subSequence, min2, i18);
                return;
            }
            c(editorInfo, null, 0, 0);
            return;
        }
        c(editorInfo, null, 0, 0);
    }

    public static void b(EditorInfo editorInfo, boolean z3) {
        if (Build.VERSION.SDK_INT >= 35) {
            a.a(editorInfo, z3);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z3);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence, int i, int i10) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }
}
