package dev.medzik.bitwardenexportparser;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class VaultItemLogin {
    public List<VaultItemLoginURI> uris;
    public String username;
    public String password;
    public String totp;
}
