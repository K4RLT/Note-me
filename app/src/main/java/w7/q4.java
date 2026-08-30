package w7;
import b.c;
import r.i;
import j1.b;
import k1.f;
import k1.r;
import p.a;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public final f f28950a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28951b;

    /* renamed from: c, reason: collision with root package name */
    public final r f28952c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28953d;
    public final d5 e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f28954f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28955g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28956h;

    public q4(f fVar, long j10, r rVar, long j11, d5 d5Var, Bitmap bitmap, String str, int i) {
        boolean z3;
        d5Var = (i & 16) != 0 ? null : d5Var;
        bitmap = (i & 32) != 0 ? null : bitmap;
        str = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f28950a = fVar;
        this.f28951b = j10;
        this.f28952c = rVar;
        this.f28953d = j11;
        this.e = d5Var;
        this.f28954f = bitmap;
        this.f28955g = str;
        this.f28956h = z3;
    }

    public final d5 a() {
        return this.e;
    }

    public final String b() {
        return this.f28955g;
    }

    public final boolean c() {
        return this.f28956h;
    }

    public final f d() {
        return this.f28950a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q4) {
                q4 q4Var = (q4) obj;
                if (kotlin.jvm.internal.l.a(this.f28950a, q4Var.f28950a)) {
                    long j10 = q4Var.f28951b;
                    int i = r.f19522m;
                    if (!pe.a(this.f28951b, j10) || !kotlin.jvm.internal.l.a(this.f28952c, q4Var.f28952c) || !b.c(this.f28953d, q4Var.f28953d) || !kotlin.jvm.internal.l.a(this.e, q4Var.e) || !kotlin.jvm.internal.l.a(this.f28954f, q4Var.f28954f) || !kotlin.jvm.internal.l.a(this.f28955g, q4Var.f28955g) || this.f28956h != q4Var.f28956h) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        f fVar = this.f28950a;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i10 = r.f19522m;
        int d2 = a.d(this.f28951b, hashCode * 31, 31);
        r rVar = this.f28952c;
        if (rVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Long.hashCode(rVar.f19523a);
        }
        int d10 = a.d(this.f28953d, (d2 + hashCode2) * 31, 31);
        d5 d5Var = this.e;
        if (d5Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d5Var.hashCode();
        }
        int i11 = (d10 + hashCode3) * 31;
        Bitmap bitmap = this.f28954f;
        if (bitmap == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bitmap.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str = this.f28955g;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.f28956h) + ((i12 + i) * 31);
    }

    public final String toString() {
        return "DragGhost(thumb=" + this.f28950a + ", colorA=" + r.i(this.f28951b) + ", colorB=" + this.f28952c + ", pos=" + b.j(this.f28953d) + ", frame=" + this.e + ", frameArt=" + this.f28954f + ", shapeType=" + this.f28955g + ", sticker=" + this.f28956h + ")";
    }
}
