package e4;
import b.a;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import c4.k;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final j.a f15904a;

    /* renamed from: b, reason: collision with root package name */
    public final de.b f15905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j.a aVar, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        de.b bVar = new de.b(13);
        this.f15904a = aVar;
        this.f15905b = bVar;
        if (k.d()) {
            k.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        Editable editableText = this.f15904a.getEditableText();
        this.f15905b.getClass();
        if (!de.a(this, editableText, i, i10, false) && !super.deleteSurroundingText(i, i10)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        Editable editableText = this.f15904a.getEditableText();
        this.f15905b.getClass();
        if (de.a(this, editableText, i, i10, true) || super.deleteSurroundingTextInCodePoints(i, i10)) {
            return true;
        }
        return false;
    }
}
