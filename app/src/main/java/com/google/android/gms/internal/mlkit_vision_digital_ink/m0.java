package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import q.h;
import q.x;
import x.o;

import android.net.Uri;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public Uri f14649a;

    /* renamed from: b, reason: collision with root package name */
    public km f14650b;

    /* renamed from: c, reason: collision with root package name */
    public d4 f14651c;

    /* renamed from: d, reason: collision with root package name */
    public z4 f14652d;
    public jm e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14653f;

    /* renamed from: g, reason: collision with root package name */
    public byte f14654g;

    public final void a(nn nnVar) {
        if (nnVar != null) {
            this.f14650b = nnVar;
        } else {
            g5.q.h("Null schema");
        }
    }

    public final void b(Uri uri) {
        if (uri != null) {
            this.f14649a = uri;
        } else {
            g5.q.h("Null uri");
        }
    }

    public final void c(boolean z3) {
        this.f14653f = z3;
        this.f14654g = (byte) (this.f14654g | 1);
    }

    public final n0 d() {
        Uri uri;
        km kmVar;
        jm jmVar;
        d4 d4Var = this.f14651c;
        if (d4Var != null) {
            this.f14652d = d4Var.d();
        } else if (this.f14652d == null) {
            e4 e4Var = h4.f14393v;
            this.f14652d = z4.f15325y;
        }
        if (this.f14654g == 3 && (uri = this.f14649a) != null && (kmVar = this.f14650b) != null && (jmVar = this.e) != null) {
            return new n0(uri, kmVar, this.f14652d, jmVar, this.f14653f);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f14649a == null) {
            sb2.append(" uri");
        }
        if (this.f14650b == null) {
            sb2.append(" schema");
        }
        if (this.e == null) {
            sb2.append(" variantConfig");
        }
        if ((this.f14654g & 1) == 0) {
            sb2.append(" useGeneratedExtensionRegistry");
        }
        if ((this.f14654g & 2) == 0) {
            sb2.append(" enableTracing");
        }
        q.x.o("Missing required properties:".concat(sb2.toString()));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.b4, com.google.android.gms.internal.mlkit_vision_digital_ink.d4] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.b4, com.google.android.gms.internal.mlkit_vision_digital_ink.d4] */
    public final void e(x0 x0Var) {
        if (this.f14651c == null) {
            if (this.f14652d == null) {
                e4 e4Var = h4.f14393v;
                this.f14651c = new b4(4);
            } else {
                e4 e4Var2 = h4.f14393v;
                b4 b4Var = new b4(4);
                this.f14651c = b4Var;
                z4 z4Var = this.f14652d;
                if (z4Var != null) {
                    b4Var.c(z4Var.f15327x);
                    b4Var.f14062b = z4Var.a(b4Var.f14061a, b4Var.f14062b);
                } else {
                    e4 listIterator = z4Var.listIterator(0);
                    while (listIterator.hasNext()) {
                        b4Var.a(listIterator.next());
                    }
                }
                this.f14652d = null;
            }
        }
        this.f14651c.a(x0Var);
    }
}
