package i0;
import j.k;
import j.l;
import j.m;
import j.s;
import j.w;
import j.x;
import l.a;

import android.R;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import c2.r2;
import g0.e1;
import g0.g2;
import g0.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k0.j1;
import m2.l0;
import m2.p0;
import r2.u;
import r2.v;
import wa.b8;
import wa.z7;
import ya.fb;

/* loaded from: classes.dex */
public final class s implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final pd.c f18084a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18085b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f18086c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f18087d;
    public final r2 e;

    /* renamed from: f, reason: collision with root package name */
    public int f18088f;

    /* renamed from: g, reason: collision with root package name */
    public x f18089g;

    /* renamed from: h, reason: collision with root package name */
    public int f18090h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f18091j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f18092k = true;

    public s(x xVar, pd.c cVar, boolean z3, e1 e1Var, j1 j1Var, r2 r2Var) {
        this.f18084a = cVar;
        this.f18085b = z3;
        this.f18086c = e1Var;
        this.f18087d = j1Var;
        this.e = r2Var;
        this.f18089g = xVar;
    }

    public final void a(r2.g gVar) {
        this.f18088f++;
        try {
            this.f18091j.add(gVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.m, df.l] */
    public final boolean b() {
        int i = this.f18088f - 1;
        this.f18088f = i;
        if (i == 0) {
            ArrayList arrayList = this.f18091j;
            if (!arrayList.isEmpty()) {
                ((r) this.f18084a.f22681u).f18075c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f18088f > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z3 = this.f18092k;
        if (z3) {
            this.f18088f++;
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
        boolean z3 = this.f18092k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f18091j.clear();
        this.f18088f = 0;
        this.f18092k = false;
        ArrayList arrayList = ((r) this.f18084a.f22681u).f18080j;
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
        boolean z3 = this.f18092k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z3 = this.f18092k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z3 = this.f18092k;
        if (z3) {
            return this.f18085b;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z3 = this.f18092k;
        if (z3) {
            a(new r2.a(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        boolean z3 = this.f18092k;
        if (z3) {
            a(new r2.e(i, i10));
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        boolean z3 = this.f18092k;
        if (z3) {
            a(new r2.f(i, i10));
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
        boolean z3 = this.f18092k;
        if (z3) {
            a(new Object());
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        x xVar = this.f18089g;
        return TextUtils.getCapsMode(xVar.f24515a.f20477v, p0.e(xVar.f24516b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z3 = true;
        int i10 = 0;
        if ((i & 1) == 0) {
            z3 = false;
        }
        this.i = z3;
        if (z3) {
            if (extractedTextRequest != null) {
                i10 = extractedTextRequest.token;
            }
            this.f18090h = i10;
        }
        return b8.a(this.f18089g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (p0.b(this.f18089g.f24516b)) {
            return null;
        }
        return fb.a(this.f18089g).f20477v;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i10) {
        return fb.b(this.f18089g, i).f20477v;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i10) {
        return fb.c(this.f18089g, i).f20477v;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z3 = this.f18092k;
        if (z3) {
            z3 = false;
            switch (i) {
                case R.id.selectAll:
                    a(new w(0, this.f18089g.f24515a.f20477v.length()));
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
        boolean z3 = this.f18092k;
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
                ((r) this.f18084a.f22681u).f18076d.invoke(new r2.i(i10));
            }
            i10 = 1;
            ((r) this.f18084a.f22681u).f18076d.invoke(new r2.i(i10));
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e3  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r23, java.util.concurrent.Executor r24, java.util.function.IntConsumer r25) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.s.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z3 = this.f18092k;
        if (z3) {
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        e1 e1Var;
        m2.g gVar;
        m2.g gVar2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        int i;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i10;
        RectF deletionArea;
        int granularity3;
        int i11;
        RectF selectionArea;
        int granularity4;
        int i12;
        l0 l0Var;
        if (Build.VERSION.SDK_INT >= 34 && (e1Var = this.f18086c) != null && (gVar = e1Var.f17069j) != null) {
            g2 d2 = e1Var.d();
            if (d2 != null && (l0Var = d2.f17113a.f20524a) != null) {
                gVar2 = l0Var.f20514a;
            } else {
                gVar2 = null;
            }
            if (gVar.equals(gVar2)) {
                boolean s10 = i.s(previewableHandwritingGesture);
                s0 s0Var = s0.f17275u;
                j1 j1Var = this.f18087d;
                if (s10) {
                    SelectGesture n10 = i.n(previewableHandwritingGesture);
                    if (j1Var != null) {
                        selectionArea = n10.getSelectionArea();
                        j1.c I = k1.l0.I(selectionArea);
                        granularity4 = n10.getGranularity();
                        if (granularity4 != 1) {
                            i12 = 0;
                        } else {
                            i12 = 1;
                        }
                        long f10 = z7.f(e1Var, I, i12);
                        e1 e1Var2 = j1Var.f19321d;
                        if (e1Var2 != null) {
                            e1Var2.f(f10);
                        }
                        e1 e1Var3 = j1Var.f19321d;
                        if (e1Var3 != null) {
                            e1Var3.e(p0.f20544b);
                        }
                        if (!p0.b(f10)) {
                            j1Var.q(false);
                            j1Var.o(s0Var);
                        }
                    }
                } else if (j.s(previewableHandwritingGesture)) {
                    DeleteGesture k3 = k(previewableHandwritingGesture);
                    if (j1Var != null) {
                        deletionArea = k3.getDeletionArea();
                        j1.c I2 = k1.l0.I(deletionArea);
                        granularity3 = k3.getGranularity();
                        if (granularity3 != 1) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        long f11 = z7.f(e1Var, I2, i11);
                        e1 e1Var4 = j1Var.f19321d;
                        if (e1Var4 != null) {
                            e1Var4.e(f11);
                        }
                        e1 e1Var5 = j1Var.f19321d;
                        if (e1Var5 != null) {
                            e1Var5.f(p0.f20544b);
                        }
                        if (!p0.b(f11)) {
                            j1Var.q(false);
                            j1Var.o(s0Var);
                        }
                    }
                } else if (w(previewableHandwritingGesture)) {
                    SelectRangeGesture m4 = m(previewableHandwritingGesture);
                    if (j1Var != null) {
                        selectionStartArea = m4.getSelectionStartArea();
                        j1.c I3 = k1.l0.I(selectionStartArea);
                        selectionEndArea = m4.getSelectionEndArea();
                        j1.c I4 = k1.l0.I(selectionEndArea);
                        granularity2 = m4.getGranularity();
                        if (granularity2 != 1) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        long b10 = z7.b(e1Var, I3, I4, i10);
                        e1 e1Var6 = j1Var.f19321d;
                        if (e1Var6 != null) {
                            e1Var6.f(b10);
                        }
                        e1 e1Var7 = j1Var.f19321d;
                        if (e1Var7 != null) {
                            e1Var7.e(p0.f20544b);
                        }
                        if (!p0.b(b10)) {
                            j1Var.q(false);
                            j1Var.o(s0Var);
                        }
                    }
                } else if (x(previewableHandwritingGesture)) {
                    DeleteRangeGesture l10 = l(previewableHandwritingGesture);
                    if (j1Var != null) {
                        deletionStartArea = l10.getDeletionStartArea();
                        j1.c I5 = k1.l0.I(deletionStartArea);
                        deletionEndArea = l10.getDeletionEndArea();
                        j1.c I6 = k1.l0.I(deletionEndArea);
                        granularity = l10.getGranularity();
                        if (granularity != 1) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        long b11 = z7.b(e1Var, I5, I6, i);
                        e1 e1Var8 = j1Var.f19321d;
                        if (e1Var8 != null) {
                            e1Var8.e(b11);
                        }
                        e1 e1Var9 = j1Var.f19321d;
                        if (e1Var9 != null) {
                            e1Var9.f(p0.f20544b);
                        }
                        if (!p0.b(b11)) {
                            j1Var.q(false);
                            j1Var.o(s0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new k(0, j1Var));
                }
                return true;
            }
        }
        return false;
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
            boolean r0 = r9.f18092k
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
            pd.c r4 = r9.f18084a
            java.lang.Object r4 = r4.f22681u
            i0.r r4 = (i0.r) r4
            i0.o r4 = r4.f18083m
            java.lang.Object r7 = r4.f18058c
            monitor-enter(r7)
            r4.f18060f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f18061g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f18062h = r1     // Catch: java.lang.Throwable -> L6f
            r4.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.e = r2     // Catch: java.lang.Throwable -> L6f
            r2.x r10 = r4.f18063j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f18059d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.s.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pe.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f18092k;
        if (z3) {
            ((BaseInputConnection) ((r) this.f18084a.f22681u).f18081k.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i10) {
        boolean z3 = this.f18092k;
        if (z3) {
            a(new u(i, i10));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z3 = this.f18092k;
        if (z3) {
            a(new v(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i10) {
        boolean z3 = this.f18092k;
        if (z3) {
            a(new w(i, i10));
            return true;
        }
        return z3;
    }
}
