package m5;
import c.o;

import android.os.Bundle;
import androidx.lifecycle.o0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.w;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c.j;
import g5.q;
import i0.m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import q.x;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20611u;

    /* renamed from: v, reason: collision with root package name */
    public final e f20612v;

    public /* synthetic */ b(e eVar, int i) {
        this.f20611u = i;
        this.f20612v = eVar;
    }

    @Override // androidx.lifecycle.u
    public final void k(w wVar, o oVar) {
        switch (this.f20611u) {
            case 0:
                if (oVar == o.ON_CREATE) {
                    wVar.g().f(this);
                    e eVar = this.f20612v;
                    Bundle e = eVar.f().e("androidx.savedstate.Restarter");
                    if (e != null) {
                        ArrayList<String> stringArrayList = e.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i = 0;
                            while (i < size) {
                                String str = stringArrayList.get(i);
                                i++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            if (eVar instanceof z0) {
                                                y0 d2 = ((z0) eVar).d();
                                                m f10 = eVar.f();
                                                d2.getClass();
                                                LinkedHashMap linkedHashMap = (LinkedHashMap) d2.f1090a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str3 = (String) it.next();
                                                    str3.getClass();
                                                    u0 u0Var = (u0) linkedHashMap.get(str3);
                                                    if (u0Var != null) {
                                                        o0.a(u0Var, f10, eVar.g());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    f10.p();
                                                }
                                            } else {
                                                l4.a.f(eVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                                return;
                                            }
                                        } catch (Exception e8) {
                                            l4.a.k(g3.a.k("Failed to instantiate ", str2), e8);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e10) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                                    }
                                } catch (ClassNotFoundException e11) {
                                    l4.a.k(p.a.k("Class ", str2, " wasn't found"), e11);
                                    return;
                                }
                            }
                            return;
                        }
                        x.o("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                q.f("Next event must be ON_CREATE");
                return;
            default:
                o oVar2 = (o) this.f20612v;
                if (oVar2.f3266y == null) {
                    j jVar = (j) oVar2.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        oVar2.f3266y = jVar.f3242a;
                    }
                    if (oVar2.f3266y == null) {
                        oVar2.f3266y = new y0(3);
                    }
                }
                oVar2.f16650u.f(this);
                return;
        }
    }
}
