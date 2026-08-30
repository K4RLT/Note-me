package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class kd1 {

    /* renamed from: a, reason: collision with root package name */
    public static final gl1 f7721a = gl1.a(new byte[0]);

    public static final gl1 a(int i) {
        return gl1.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final gl1 b(int i) {
        return gl1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
