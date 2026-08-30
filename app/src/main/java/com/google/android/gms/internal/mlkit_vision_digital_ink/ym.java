package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class ym {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f15284b = Logger.getLogger(ym.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f15285c = dp.e;

    /* renamed from: a, reason: collision with root package name */
    public s5 f15286a;

    public static int a(km kmVar) {
        int e = ((nn) kmVar).e();
        return c(e) + e;
    }

    public static int b(String str) {
        int length;
        try {
            length = fp.c(str);
        } catch (ep unused) {
            length = str.getBytes(vn.f15137a).length;
        }
        return c(length) + length;
    }

    public static int c(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int d(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public abstract void A(long j10);

    public final void e(String str, ep epVar) {
        f15284b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) epVar);
        byte[] bytes = str.getBytes(vn.f15137a);
        try {
            int length = bytes.length;
            y(length);
            i(bytes, length);
        } catch (IndexOutOfBoundsException e) {
            throw new af.c(e);
        }
    }

    public abstract void f(byte b10);

    public abstract void g(int i, boolean z3);

    public abstract void h(byte[] bArr, int i);

    public abstract void i(byte[] bArr, int i);

    public abstract void j(int i, tm tmVar);

    public abstract void k(tm tmVar);

    public abstract void l(int i, int i10);

    public abstract void m(int i);

    public abstract void n(int i, long j10);

    public abstract void o(long j10);

    public abstract void p(int i, int i10);

    public abstract void q(int i);

    public abstract void r(km kmVar);

    public abstract void s(int i, km kmVar);

    public abstract void t(int i, tm tmVar);

    public abstract void u(int i, String str);

    public abstract void v(String str);

    public abstract void w(int i, int i10);

    public abstract void x(int i, int i10);

    public abstract void y(int i);

    public abstract void z(int i, long j10);
}
