package dev.medzik.bitwardenexportparser;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@RequiredArgsConstructor
public class VaultItem {
    @NonNull
    public UUID id;
    public UUID organizationId;
    public UUID folderId;
    @NonNull
    public Integer type;
    @NonNull
    public String name;
    public String notes;
    public Boolean favorite;
    public VaultItemCard card;
    public VaultItemSecureNote secureNote;
    public UUID collectionIds;
}
