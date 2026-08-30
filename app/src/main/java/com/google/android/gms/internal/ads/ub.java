package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class ub {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f11597b = Logger.getLogger(ub.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final a7.k f11598a = new a7.k(6);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.zb, com.google.android.gms.internal.ads.jr1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.kr1] */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.google.android.gms.internal.ads.kr1] */
    public final xb a(yy yyVar, kr1 kr1Var) {
        int f10;
        long j10;
        ac acVar;
        ac acVar2;
        long j11 = yyVar.j();
        ByteBuffer byteBuffer = yyVar.f13007u;
        a7.k kVar = this.f11598a;
        ((ByteBuffer) kVar.get()).rewind().limit(8);
        do {
            f10 = yyVar.f((ByteBuffer) kVar.get());
            if (f10 == 8) {
                ((ByteBuffer) kVar.get()).rewind();
                long c10 = ay0.c((ByteBuffer) kVar.get());
                if (c10 < 8 && c10 > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(c10);
                    sb2.append("). Stop parsing!");
                    f11597b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) kVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (c10 == 1) {
                        ((ByteBuffer) kVar.get()).limit(16);
                        yyVar.f((ByteBuffer) kVar.get());
                        ((ByteBuffer) kVar.get()).position(8);
                        j10 = ay0.y((ByteBuffer) kVar.get()) - 16;
                    } else if (c10 == 0) {
                        j10 = byteBuffer.limit() - yyVar.j();
                    } else {
                        j10 = c10 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) kVar.get()).limit(((ByteBuffer) kVar.get()).limit() + 16);
                        yyVar.f((ByteBuffer) kVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = ((ByteBuffer) kVar.get()).position() - 16; position < ((ByteBuffer) kVar.get()).position(); position++) {
                            bArr2[position - (((ByteBuffer) kVar.get()).position() - 16)] = ((ByteBuffer) kVar.get()).get(position);
                        }
                        j10 -= 16;
                    }
                    long j12 = j10;
                    if (kr1Var instanceof xb) {
                    }
                    if ("moov".equals(str)) {
                        acVar2 = new kr1();
                    } else {
                        if ("mvhd".equals(str)) {
                            ?? jr1Var = new jr1("mvhd");
                            jr1Var.H = 1.0d;
                            jr1Var.I = 1.0f;
                            jr1Var.J = or1.f9197j;
                            acVar = jr1Var;
                            ((ByteBuffer) kVar.get()).rewind();
                            acVar.f(yyVar, (ByteBuffer) kVar.get(), j12, this);
                            return acVar;
                        }
                        acVar2 = new ac(str, 0);
                    }
                    acVar = acVar2;
                    ((ByteBuffer) kVar.get()).rewind();
                    acVar.f(yyVar, (ByteBuffer) kVar.get(), j12, this);
                    return acVar;
                } catch (UnsupportedEncodingException e) {
                    g5.q.k(e);
                    return null;
                }
            }
        } while (f10 >= 0);
        byteBuffer.position((int) j11);
        throw new EOFException();
    }
}
