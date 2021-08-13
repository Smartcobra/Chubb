public class Account implements OnlineAccount,Comparable<Account> {
    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    public Account(String ownerName,int noOfRegularMovies,int noOfExclusiveMovies){
        this.noOfExclusiveMovies=noOfExclusiveMovies;
        this.noOfRegularMovies=noOfRegularMovies;
        this.ownerName=ownerName;
    }


    // 2. This method returns the monthly cost for the account.
    public int monthlyCost() {
        return basePrice+noOfRegularMovies*regularMoviePrice;
    }
    @Override
    public int compareTo(Account acc){
        return Integer.compare(this.monthlyCost(), acc.monthlyCost());
    }

    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    public String toString() {

     return "Owner is "+ownerName+" and monthly cost is "+monthlyCost()+" USD.";
    }


}
