package e4;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class c implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f15906a;

    public c(KeyListener keyListener) {
        this.f15906a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f15906a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f15906a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean t3;
        boolean z3;
        if (i != 67) {
            if (i != 112) {
                t3 = false;
            } else {
                t3 = ra.e.t(editable, keyEvent, true);
            }
        } else {
            t3 = ra.e.t(editable, keyEvent, false);
        }
        if (t3) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.f15906a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f15906a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f15906a.onKeyUp(view, editable, i, keyEvent);
    }
}
