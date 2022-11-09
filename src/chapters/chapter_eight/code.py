from eth_account import Account
import subprocess
import secrets

#x = 0
funds = "$0.00"
priv = ""
pub = ""

while funds == "$0.00":

    priv = secrets.token_hex(32)
    private_key = "0x" + priv                                                    
    acct = Account.from_key(private_key)                                         
    pub = acct.address

    #if x == 5:
        #priv = "no idea"
        #pub = "0xfc5c9bd4444908f535027cc4b39f7287f7654ffc"

    result = subprocess.run(['curl', '-s', 'https://etherscan.io/address/' + pub], stdout=subprocess.PIPE)
    getext = result.stdout
    gettext = str(getext)

    for i in range(len(gettext)):
        if gettext[i] + gettext[i+1] + gettext[i+2] + gettext[i+3] == "8\">$":
           j = i
           funds = ""
           while gettext[j+3] != "<":
                funds += gettext[j+3]
                j += 1
           break
    print(pub + " = " + funds + " in " + priv)
    #x += 1

print("Account Private Key: " + priv)
print("Account Public Key: " + pub)
print("Funds: " + funds)
