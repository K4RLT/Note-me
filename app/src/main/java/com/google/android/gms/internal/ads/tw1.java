package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface tw1 {
    ByteBuffer B(int i);

    int a();

    ByteBuffer b(int i);

    MediaFormat e();

    void f(ArrayList arrayList);

    void g(int i, cs1 cs1Var, long j10, int i10);

    void h();

    void i();

    void j(Bundle bundle);

    void l(Surface surface);

    void m(int i);

    int n(MediaCodec.BufferInfo bufferInfo);

    void o(int i);

    void p();

    default boolean r(bl0 bl0Var) {
        return false;
    }

    void v(int i, int i10, int i11, long j10);

    default void w(ou1 ou1Var) {
        ou1Var.run();
    }

    void x(int i, long j10);
}
