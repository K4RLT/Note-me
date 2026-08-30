package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ac extends jr1 {
    public final /* synthetic */ int C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(String str, int i) {
        super(str);
        this.C = i;
    }

    @Override // com.google.android.gms.internal.ads.jr1
    public final void b(ByteBuffer byteBuffer) {
        switch (this.C) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                return;
            default:
                return;
        }
    }

    private final void d(ByteBuffer byteBuffer) {
    }
}
