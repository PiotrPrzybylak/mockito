/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.verification;

import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

public class Only implements VerificationMode {

    private final Times once = new Times(1);

    private final NoMoreInteractions noMoreInteractions = new NoMoreInteractions();

    @Override
    public void verify(VerificationData data) {
        once.verify(data);
        noMoreInteractions.verify(data);
    }

    @Override
    public String toString() {
        return "Wanted invocations count: 1 and no other method invoked";
    }
}
