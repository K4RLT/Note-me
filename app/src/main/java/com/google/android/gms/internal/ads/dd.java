package com.google.android.gms.internal.ads;
import nc.a;

import java.util.ArrayDeque;
import java.util.Optional;

/* loaded from: classes.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    public final ad f5402a;

    /* renamed from: b, reason: collision with root package name */
    public final jk0 f5403b = new jk0(7);

    /* renamed from: c, reason: collision with root package name */
    public final tc f5404c;

    public dd(ad adVar, tc tcVar) {
        this.f5402a = adVar;
        this.f5404c = tcVar;
    }

    public final Optional a() {
        dc dcVar;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f5403b.f7466v;
            if (!arrayDeque.isEmpty()) {
                vc vcVar = (vc) arrayDeque.pop();
                long j10 = vcVar.f11882a;
                long j11 = vcVar.f11883b;
                long j12 = vcVar.f11884c;
                ad adVar = this.f5402a;
                if (adVar.f4459b < j11) {
                    return Optional.of(dc.f5388b0);
                }
                this.f5404c.a(j10);
                if (j12 == 0) {
                    while (adVar.f4459b > j11) {
                        adVar.e();
                    }
                }
                return Optional.empty();
            }
            throw new Exception();
        } catch (rc e) {
            e = e;
            throw new AssertionError(a("CEiv6BFfPnitUE+D"), e);
        } catch (sc e8) {
            e = e8;
            throw new AssertionError(a("CEiv6BFfPnitUE+D"), e);
        } catch (xc unused) {
            dcVar = dc.R;
            return Optional.of(dcVar);
        } catch (yc unused2) {
            dcVar = dc.f5388b0;
            return Optional.of(dcVar);
        }
    }
}
