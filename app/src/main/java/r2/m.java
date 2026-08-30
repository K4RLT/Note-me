package r2;

import a0.k0;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class m implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f24499a;

    /* renamed from: b, reason: collision with root package name */
    public i0.s f24500b;

    public m(i0.s sVar, k0 k0Var) {
        this.f24499a = k0Var;
        this.f24500b = sVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            if (sVar != null) {
                sVar.closeConnection();
                this.f24500b = null;
            }
            this.f24499a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.deleteSurroundingText(i, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.deleteSurroundingTextInCodePoints(i, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i10) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.getTextAfterCursor(i, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i10) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.getTextBeforeCursor(i, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i10) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.setComposingRegion(i, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i10) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.setSelection(i, i10);
        }
        return false;
    }
}
