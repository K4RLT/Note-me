package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface t10 {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f11228a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a();

    ByteBuffer b();

    boolean c();

    default long d(long j10) {
        return j10;
    }

    boolean e();

    void f();

    void g(ByteBuffer byteBuffer);

    a00 h(a00 a00Var);

    void i(w00 w00Var);
}
