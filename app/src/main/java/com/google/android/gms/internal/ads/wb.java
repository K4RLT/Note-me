package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class wb extends kr1 {
    static {
        lr1.c(wb.class);
    }

    public wb(yy yyVar, ub ubVar) {
        ByteBuffer byteBuffer = yyVar.f13007u;
        long limit = byteBuffer.limit();
        this.f7855v = yyVar;
        this.f7857x = yyVar.j();
        byteBuffer.position((int) (yyVar.j() + limit));
        this.f7858y = yyVar.j();
        this.f7854u = ubVar;
    }

    @Override // com.google.android.gms.internal.ads.kr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.kr1
    public final String toString() {
        String obj = this.f7855v.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
