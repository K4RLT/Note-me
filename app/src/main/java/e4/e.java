package e4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import c4.k;

/* loaded from: classes.dex */
public final class e implements TextWatcher {

    /* renamed from: u, reason: collision with root package name */
    public final j.a f15908u;

    /* renamed from: v, reason: collision with root package name */
    public d f15909v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15910w = true;

    public e(j.a aVar) {
        this.f15908u = aVar;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k a10 = k.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.g(editableText, 0, length, 0);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        j.a aVar = this.f15908u;
        if (!aVar.isInEditMode() && this.f15910w && k.d() && i10 <= i11 && (charSequence instanceof Spannable)) {
            int c10 = k.a().c();
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 3) {
                        return;
                    }
                } else {
                    k.a().g((Spannable) charSequence, i, i11 + i, 0);
                    return;
                }
            }
            k a10 = k.a();
            if (this.f15909v == null) {
                this.f15909v = new d(aVar);
            }
            a10.h(this.f15909v);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
