package r2;
import l.a;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m2.p0;
import ya.eb;
import ya.fb;

/* loaded from: classes.dex */
public final class t implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final ic.c f24502a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24503b;

    /* renamed from: c, reason: collision with root package name */
    public int f24504c;

    /* renamed from: d, reason: collision with root package name */
    public x f24505d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24506f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f24507g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f24508h = true;

    public t(x xVar, ic.c cVar, boolean z3) {
        this.f24502a = cVar;
        this.f24503b = z3;
        this.f24505d = xVar;
    }

    public final void a(g gVar) {
        this.f24504c++;
        try {
            this.f24507g.add(gVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.m, df.l] */
    public final boolean b() {
        int i = this.f24504c - 1;
        this.f24504c = i;
        if (i == 0) {
            ArrayList arrayList = this.f24507g;
            if (!arrayList.isEmpty()) {
                ((a0) this.f24502a.f18393v).e.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f24504c > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z3 = this.f24508h;
        if (z3) {
            this.f24504c++;
            return true;
        }
        return z3;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z3 = this.f24508h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f24507g.clear();
        this.f24504c = 0;
        this.f24508h = false;
        ArrayList arrayList = ((a0) this.f24502a.f18393v).i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.a(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z3 = this.f24508h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z3 = this.f24508h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z3 = this.f24508h;
        if (z3) {
            return this.f24503b;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z3 = this.f24508h;
        if (z3) {
            a(new a(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        boolean z3 = this.f24508h;
        if (z3) {
            a(new e(i, i10));
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        boolean z3 = this.f24508h;
        if (z3) {
            a(new f(i, i10));
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r2.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z3 = this.f24508h;
        if (z3) {
            a(new Object());
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        x xVar = this.f24505d;
        return TextUtils.getCapsMode(xVar.f24515a.f20477v, p0.e(xVar.f24516b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z3 = true;
        int i10 = 0;
        if ((i & 1) == 0) {
            z3 = false;
        }
        this.f24506f = z3;
        if (z3) {
            if (extractedTextRequest != null) {
                i10 = extractedTextRequest.token;
            }
            this.e = i10;
        }
        return eb.a(this.f24505d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (p0.b(this.f24505d.f24516b)) {
            return null;
        }
        return fb.a(this.f24505d).f20477v;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i10) {
        return fb.b(this.f24505d, i).f20477v;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i10) {
        return fb.c(this.f24505d, i).f20477v;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z3 = this.f24508h;
        if (z3) {
            z3 = false;
            switch (i) {
                case R.id.selectAll:
                    a(new w(0, this.f24505d.f24515a.f20477v.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i10;
        boolean z3 = this.f24508h;
        if (z3) {
            z3 = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i10 = 2;
                        break;
                    case 3:
                        i10 = 3;
                        break;
                    case 4:
                        i10 = 4;
                        break;
                    case 5:
                        i10 = 6;
                        break;
                    case 6:
                        i10 = 7;
                        break;
                    case 7:
                        i10 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((a0) this.f24502a.f18393v).f24451f.invoke(new i(i10));
            }
            i10 = 1;
            ((a0) this.f24502a.f18393v).f24451f.invoke(new i(i10));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z3 = this.f24508h;
        if (z3) {
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f24508h
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            ic.c r4 = r9.f24502a
            java.lang.Object r4 = r4.f18393v
            r2.a0 r4 = (r2.a0) r4
            r2.c r4 = r4.f24456l
            java.lang.Object r7 = r4.f24469c
            monitor-enter(r7)
            r4.f24471f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f24472g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f24473h = r1     // Catch: java.lang.Throwable -> L6f
            r4.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.e = r2     // Catch: java.lang.Throwable -> L6f
            r2.x r10 = r4.f24474j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f24470d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.t.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pe.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f24508h;
        if (z3) {
            ((BaseInputConnection) ((a0) this.f24502a.f18393v).f24454j.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i10) {
        boolean z3 = this.f24508h;
        if (z3) {
            a(new u(i, i10));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z3 = this.f24508h;
        if (z3) {
            a(new v(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i10) {
        boolean z3 = this.f24508h;
        if (z3) {
            a(new w(i, i10));
            return true;
        }
        return z3;
    }
}
