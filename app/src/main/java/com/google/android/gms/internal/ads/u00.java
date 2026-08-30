package com.google.android.gms.internal.ads;
import g9.a2;
import g9.r;
import g9.w2;
import g9.x1;
import g9.z1;
import l9.i;
import n.r0;
import r.e;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u00 extends g9.x1 {
    public boolean A;
    public float C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public ro H;

    /* renamed from: u, reason: collision with root package name */
    public final h00 f11502u;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f11504w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11505x;

    /* renamed from: y, reason: collision with root package name */
    public int f11506y;

    /* renamed from: z, reason: collision with root package name */
    public g9.a2 f11507z;

    /* renamed from: v, reason: collision with root package name */
    public final Object f11503v = new Object();
    public boolean B = true;

    public u00(h00 h00Var, float f10, boolean z3, boolean z9) {
        this.f11502u = h00Var;
        this.C = f10;
        this.f11504w = z3;
        this.f11505x = z9;
    }

    @Override // g9.z1
    public final void a() {
        y4("play", null);
    }

    @Override // g9.z1
    public final void b() {
        y4("pause", null);
    }

    @Override // g9.z1
    public final boolean d() {
        boolean z3;
        synchronized (this.f11503v) {
            z3 = this.B;
        }
        return z3;
    }

    @Override // g9.z1
    public final float f() {
        float f10;
        synchronized (this.f11503v) {
            f10 = this.C;
        }
        return f10;
    }

    @Override // g9.z1
    public final int g() {
        int i;
        synchronized (this.f11503v) {
            i = this.f11506y;
        }
        return i;
    }

    @Override // g9.z1
    public final float i() {
        float f10;
        synchronized (this.f11503v) {
            f10 = this.D;
        }
        return f10;
    }

    @Override // g9.z1
    public final void j() {
        y4("stop", null);
    }

    @Override // g9.z1
    public final float m() {
        float f10;
        synchronized (this.f11503v) {
            f10 = this.E;
        }
        return f10;
    }

    @Override // g9.z1
    public final boolean n() {
        boolean z3;
        synchronized (this.f11503v) {
            try {
                z3 = false;
                if (this.f11504w && this.F) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // g9.z1
    public final g9.a2 p() {
        g9.a2 a2Var;
        synchronized (this.f11503v) {
            a2Var = this.f11507z;
        }
        return a2Var;
    }

    @Override // g9.z1
    public final void p0(boolean z3) {
        String str;
        if (true != z3) {
            str = "unmute";
        } else {
            str = "mute";
        }
        y4(str, null);
    }

    @Override // g9.z1
    public final boolean q() {
        boolean z3;
        Object obj = this.f11503v;
        boolean n10 = n();
        synchronized (obj) {
            z3 = false;
            if (!n10) {
                try {
                    if (this.G && this.f11505x) {
                        z3 = true;
                    }
                } finally {
                }
            }
        }
        return z3;
    }

    @Override // g9.z1
    public final void u0(g9.a2 a2Var) {
        synchronized (this.f11503v) {
            this.f11507z = a2Var;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, n.r0] */
    public final void w4(g9.w2 w2Var) {
        String str;
        String str2;
        String str3;
        Object obj = this.f11503v;
        boolean z3 = w2Var.f17711v;
        boolean z9 = w2Var.f17712w;
        synchronized (obj) {
            this.F = z3;
            this.G = z9;
        }
        boolean z10 = w2Var.f17710u;
        if (true != z3) {
            str = "0";
        } else {
            str = "1";
        }
        if (true != z9) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        if (true != z10) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        n.r0 r0Var = new n.r0(3);
        r0Var.put("muteStart", str3);
        r0Var.put("customControlsRequested", str);
        r0Var.put("clickToExpandRequested", str2);
        y4("initialState", Collections.unmodifiableMap(r0Var));
    }

    public final void x4(float f10, float f11, int i, boolean z3, float f12) {
        boolean z9;
        boolean z10;
        int i10;
        synchronized (this.f11503v) {
            try {
                z9 = true;
                if (f11 == this.C && f12 == this.E) {
                    z9 = false;
                }
                this.C = f11;
                if (!((Boolean) g9.r.e.f17698c.a(sl.f10830le)).booleanValue()) {
                    this.D = f10;
                }
                z10 = this.B;
                this.B = z3;
                i10 = this.f11506y;
                this.f11506y = i;
                float f13 = this.E;
                this.E = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.f11502u.U().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            try {
                ro roVar = this.H;
                if (roVar != null) {
                    roVar.v2(roVar.g2(), 2);
                }
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
        xx.f12655f.execute(new t00(this, i10, i, z10, z3));
    }

    public final void y4(String str, Map map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        xx.f12655f.execute(new t81(this, 12, hashMap));
    }
}
