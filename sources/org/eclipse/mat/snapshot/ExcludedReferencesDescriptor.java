package org.eclipse.mat.snapshot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class ExcludedReferencesDescriptor {
    private Set<String> fields;
    private int[] objectIds;

    public final Set<String> getFields() {
        return this.fields;
    }

    public final int[] getObjectIds() {
        return this.objectIds;
    }

    public final boolean contains(int i) {
        if (Arrays.binarySearch(this.objectIds, i) >= 0) {
            return true;
        }
        return false;
    }

    public ExcludedReferencesDescriptor(int[] iArr, Set<String> set) {
        this.fields = set;
        this.objectIds = iArr;
        Arrays.sort(this.objectIds);
    }

    public ExcludedReferencesDescriptor(int[] iArr, String... strArr) {
        this(iArr, (Set<String>) new HashSet<String>(Arrays.asList(strArr)));
    }
}
