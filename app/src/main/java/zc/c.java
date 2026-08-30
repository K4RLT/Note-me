package zc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f32041a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f32042b;

    public c(String str, Map map) {
        this.f32041a = str;
        this.f32042b = map;
    }

    public static c b(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation a(Class cls) {
        return (Annotation) this.f32042b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f32041a.equals(cVar.f32041a) && this.f32042b.equals(cVar.f32042b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32042b.hashCode() + (this.f32041a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f32041a + ", properties=" + this.f32042b.values() + "}";
    }
}
