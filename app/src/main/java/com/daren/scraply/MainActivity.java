package com.daren.scraply;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import b1.h;
import b8.l2;
import c.o;
import c2.m;
import f8.a;
import ib.i;
import j6.n;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import pf.b0;
import pf.l0;
import q.x;
import q7.b;
import sf.n0;
import te.c;
import u7.m3;
import u7.u2;
import wa.a9;
import wf.d;
import wf.e;
import x7.f0;
import ya.ga;
import ya.q9;

/* loaded from: classes.dex */
public final class MainActivity extends o {
    public static final /* synthetic */ int P = 0;
    public volatile boolean O;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int toolType;
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 9 || actionMasked == 7) && ((toolType = motionEvent.getToolType(0)) == 2 || toolType == 4)) {
            q9.f31456b = SystemClock.uptimeMillis();
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r0 != 6) goto L33;
     */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r10.getClass()
            int r0 = r10.getActionMasked()
            r1 = 6
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1a
            if (r0 == r2) goto L1f
            r5 = 3
            if (r0 == r5) goto L1a
            r5 = 5
            if (r0 == r5) goto L1f
            if (r0 == r1) goto L1f
            goto L5d
        L1a:
            ya.q9.f31457c = r4
            ya.q9.f31458d = r4
            goto L5d
        L1f:
            int r0 = r10.getActionMasked()
            if (r0 != r1) goto L2a
            int r0 = r10.getActionIndex()
            goto L2b
        L2a:
            r0 = -1
        L2b:
            int r1 = r10.getPointerCount()
            r5 = r4
            r6 = r5
        L31:
            if (r4 >= r1) goto L4f
            if (r4 == r0) goto L4c
            int r7 = r10.getToolType(r4)
            if (r7 == r2) goto L4b
            r8 = 4
            if (r7 != r8) goto L3f
            goto L4b
        L3f:
            float r7 = r10.getTouchMajor(r4)
            float r8 = ya.q9.e
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L4c
            r6 = r3
            goto L4c
        L4b:
            r5 = r3
        L4c:
            int r4 = r4 + 1
            goto L31
        L4f:
            ya.q9.f31457c = r5
            ya.q9.f31458d = r6
            if (r5 == 0) goto L5d
            long r0 = android.os.SystemClock.uptimeMillis()
            ya.q9.f31455a = r0
            ya.q9.f31456b = r0
        L5d:
            boolean r10 = super.dispatchTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daren.scraply.MainActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void j(Intent intent) {
        Uri data;
        if (l.a(intent.getAction(), "android.intent.action.VIEW") && (data = intent.getData()) != null) {
            n0 n0Var = f0.f30184a;
            String string = getString(R.string.loading_importing);
            string.getClass();
            f0.e(string);
            e eVar = l0.f22767a;
            b0.x(b0.b(d.f29913w), null, new l2(this, data, (c) null, 7), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0731  */
    /* JADX WARN: Type inference failed for: r0v117, types: [c7.c] */
    /* JADX WARN: Type inference failed for: r20v0, types: [wa.g] */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.content.Context, c.o, com.daren.scraply.MainActivity, java.lang.Object, android.app.Activity, f3.a] */
    /* JADX WARN: Type inference failed for: r2v101, types: [c7.d, java.lang.Object] */
    @Override // c.o, f3.a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 2614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daren.scraply.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // c.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        j(intent);
        String stringExtra = intent.getStringExtra("scraply_notif_kind");
        boolean a10 = q7.c.a(this, intent);
        boolean z3 = b.f23562a;
        if (!a10) {
            return;
        }
        n0 n0Var = q7.e.f23567a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        q7.e.e(applicationContext, true);
        ga.b(this, stringExtra);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        boolean z3 = b.f23562a;
        b.f23562a = false;
        e7.o oVar = e7.o.f15975a;
        e7.o.i = false;
        Handler handler = e7.o.f15979f;
        handler.removeCallbacks(e7.o.f15988p);
        handler.removeCallbacks(e7.o.f15984l);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        jb.e a10 = a9.a(this);
        a10.getClass();
        ib.o a11 = a10.a();
        h hVar = new h(6, new a(a10, this, 0));
        a11.getClass();
        a11.f(i.f18364a, hVar);
        boolean z3 = b.f23562a;
        b.f23562a = true;
        n0 n0Var = q7.e.f23567a;
        getApplicationContext().getSharedPreferences("scraply_notify", 0).edit().putLong("last_open_at", System.currentTimeMillis()).putInt("last_step", 0).apply();
        ga.c(this);
        b.a(this);
        e7.o oVar = e7.o.f15975a;
        e7.o.e = getApplicationContext();
        e7.o.i = true;
        e7.o.f15983k = 0;
        e7.o.d(this);
        Handler handler = e7.o.f15979f;
        m mVar = e7.o.f15988p;
        handler.removeCallbacks(mVar);
        if (!e7.o.i) {
            return;
        }
        handler.postDelayed(mVar, 2700000L);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        n0 n0Var = t7.b.f25651a;
        getApplicationContext().getSharedPreferences("scraply_rating", 0).edit().putBoolean("clean_exit", true).apply();
    }

    @Override // c.o, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if ((i != 15 && i < 40) || !this.O) {
            return;
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        n nVar = new n(d(), new u2(applicationContext), c());
        kotlin.jvm.internal.e a10 = z.a(m3.class);
        String b10 = a10.b();
        if (b10 != null) {
            ((m3) nVar.j(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10))).L0(this);
        } else {
            x.n("Local and anonymous classes can not be ViewModels");
        }
    }
}
