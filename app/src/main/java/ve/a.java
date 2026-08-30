package ve;

import j.a0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import pe.k;

/* loaded from: classes.dex */
public abstract class a implements te.c, d, Serializable {
    private final te.c completion;

    public a(te.c cVar) {
        this.completion = cVar;
    }

    public te.c create(te.c cVar) {
        cVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        te.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final te.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i10;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        int i11 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            i = i10 - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i11 = eVar.l()[i];
        }
        a0 a0Var = f.f27656b;
        a0 a0Var2 = f.f27655a;
        if (a0Var == null) {
            try {
                a0 a0Var3 = new a0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f27656b = a0Var3;
                a0Var = a0Var3;
            } catch (Exception unused2) {
                f.f27656b = a0Var2;
                a0Var = a0Var2;
            }
        }
        if (a0Var != a0Var2 && (method = a0Var.f18612a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = a0Var.f18613b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = a0Var.f18614c;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // te.c
    public final void resumeWith(Object obj) {
        te.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            te.c cVar2 = aVar.completion;
            cVar2.getClass();
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == ue.a.f27192u) {
                    return;
                }
            } catch (Throwable th) {
                obj = new k(th);
            }
            aVar.releaseIntercepted();
            if (cVar2 instanceof a) {
                cVar = cVar2;
            } else {
                cVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public te.c create(Object obj, te.c cVar) {
        cVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
