package uf;
import f.c;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f27211a;

    static {
        try {
            Iterator it = Arrays.asList(new qf.b()).iterator();
            it.getClass();
            f27211a = lf.c(new lf.a(new lf.h(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
