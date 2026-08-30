package sg;
import p.a;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import q.x;

/* loaded from: classes.dex */
public final class k implements t {

    /* renamed from: u, reason: collision with root package name */
    public int f25285u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25286v;

    /* renamed from: w, reason: collision with root package name */
    public final n f25287w;

    /* renamed from: x, reason: collision with root package name */
    public final Inflater f25288x;

    public k(n nVar, Inflater inflater) {
        this.f25287w = nVar;
        this.f25288x = inflater;
    }

    @Override // sg.t
    public final v a() {
        return this.f25287w.f25297w.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25286v) {
            return;
        }
        this.f25288x.end();
        this.f25286v = true;
        this.f25287w.close();
    }

    @Override // sg.t
    public final long q(f fVar, long j10) {
        boolean z3;
        fVar.getClass();
        if (j10 >= 0) {
            if (!this.f25286v) {
                if (j10 == 0) {
                    return 0L;
                }
                do {
                    Inflater inflater = this.f25288x;
                    boolean needsInput = inflater.needsInput();
                    n nVar = this.f25287w;
                    z3 = false;
                    if (needsInput) {
                        int i = this.f25285u;
                        if (i != 0) {
                            int remaining = i - inflater.getRemaining();
                            this.f25285u -= remaining;
                            nVar.skip(remaining);
                        }
                        if (inflater.getRemaining() == 0) {
                            if (nVar.f()) {
                                z3 = true;
                            } else {
                                o oVar = nVar.f25296v.f25273u;
                                if (oVar != null) {
                                    int i10 = oVar.f25300c;
                                    int i11 = oVar.f25299b;
                                    int i12 = i10 - i11;
                                    this.f25285u = i12;
                                    inflater.setInput(oVar.f25298a, i11, i12);
                                } else {
                                    kotlin.jvm.internal.l.g();
                                    throw null;
                                }
                            }
                        } else {
                            x.o("?");
                            return 0L;
                        }
                    }
                    try {
                        o A = fVar.A(1);
                        int inflate = inflater.inflate(A.f25298a, A.f25300c, (int) Math.min(j10, 8192 - A.f25300c));
                        if (inflate > 0) {
                            A.f25300c += inflate;
                            long j11 = inflate;
                            fVar.f25274v += j11;
                            return j11;
                        }
                        if (!inflater.finished() && !inflater.needsDictionary()) {
                        }
                        int i13 = this.f25285u;
                        if (i13 != 0) {
                            int remaining2 = i13 - inflater.getRemaining();
                            this.f25285u -= remaining2;
                            nVar.skip(remaining2);
                        }
                        if (A.f25299b == A.f25300c) {
                            fVar.f25273u = A.a();
                            a(A);
                            return -1L;
                        }
                        return -1L;
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                } while (!z3);
                throw new EOFException("source exhausted prematurely");
            }
            x.o("closed");
            return 0L;
        }
        x.j(g3.a.h(j10, "byteCount < 0: "));
        return 0L;
    }
}
