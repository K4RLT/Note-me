package com.google.android.gms.internal.ads;
import a5.a;
import p.a;
import q.x;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class wv1 extends e20 {
    public d71 i;

    /* renamed from: j, reason: collision with root package name */
    public d71 f12340j;

    @Override // com.google.android.gms.internal.ads.t10
    public final void g(ByteBuffer byteBuffer) {
        int i;
        boolean z3;
        int i10;
        int i11;
        d71 d71Var = this.f12340j;
        d71Var.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.f5577b.f4302d) * this.f5578c.f4302d);
        while (position < limit) {
            for (int i12 = 0; i12 < d71Var.f5333v; i12++) {
                int f10 = (bq0.f(this.f5577b.f4301c) * d71Var.a(i12)) + position;
                int i13 = this.f5577b.f4301c;
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 21) {
                                if (i13 != 22) {
                                    if (i13 != 268435456) {
                                        if (i13 != 1342177280) {
                                            if (i13 != 1610612736) {
                                                if (i13 != 1879048192) {
                                                    if (i13 != 1895825408) {
                                                        if (i13 != 1912602624) {
                                                            q.x.o(a5.a.f(i13, "Unexpected encoding: ", new StringBuilder(String.valueOf(i13).length() + 21)));
                                                            return;
                                                        }
                                                    }
                                                }
                                                j10.putDouble(byteBuffer.getDouble(f10));
                                            }
                                        }
                                    }
                                }
                                j10.putInt(byteBuffer.getInt(f10));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i = f10;
                            } else {
                                i = f10 + 2;
                            }
                            byte b10 = byteBuffer.get(i);
                            byte b11 = byteBuffer.get(f10 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                f10 += 2;
                            }
                            int i14 = ((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680) | ((byteBuffer.get(f10) << 8) & 65280);
                            int i15 = i14 >> 8;
                            boolean z9 = true;
                            if ((i15 & (-16777216)) == 0 || (i15 & (-8388608)) == -8388608) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            b80.J(z3, "Value out of range of 24-bit integer: %s", Integer.toHexString(i15));
                            if (j10.remaining() < 3) {
                                z9 = false;
                            }
                            b80.l(z9);
                            if (j10.order() == byteOrder) {
                                i10 = (i14 >> 24) & 255;
                            } else {
                                i10 = i15 & 255;
                            }
                            byte b12 = (byte) i10;
                            int i16 = (i14 >> 16) & 255;
                            if (j10.order() == byteOrder) {
                                i11 = i15 & 255;
                            } else {
                                i11 = (i14 >> 24) & 255;
                            }
                            j10.put(b12).put((byte) i16).put((byte) i11);
                        }
                        j10.putFloat(byteBuffer.getFloat(f10));
                    } else {
                        j10.put(byteBuffer.get(f10));
                    }
                }
                j10.putShort(byteBuffer.getShort(f10));
            }
            position += this.f5577b.f4302d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final a00 k(a00 a00Var) {
        boolean z3;
        boolean z9;
        d71 d71Var = this.i;
        if (d71Var == null) {
            return a00.e;
        }
        int i = a00Var.f4301c;
        if (bq0.d(i)) {
            int i10 = d71Var.f5333v;
            int i11 = a00Var.f4300b;
            if (i11 != i10) {
                z3 = true;
            } else {
                z3 = false;
            }
            for (int i12 = 0; i12 < i10; i12++) {
                int a10 = d71Var.a(i12);
                if (a10 < i11) {
                    if (a10 != i12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z3 |= z9;
                } else {
                    String d71Var2 = d71Var.toString();
                    throw new i10(p.a.o(new StringBuilder(d71Var2.length() + 59), "Channel map (", d71Var2, ") trying to access non-existent input channel."), a00Var);
                }
            }
            if (z3) {
                return new a00(a00Var.f4299a, i10, i);
            }
            return a00.e;
        }
        throw new i10("Unhandled input format:", a00Var);
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void m() {
        this.f12340j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void n() {
        this.f12340j = null;
        this.i = null;
    }
}
